package com.microsoft.bingads.internal;

import com.microsoft.bingads.AsyncCallback;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ResultFuture<T> implements Future<T> {

    final AsyncCallback<T> handler;

    protected T result;
    protected Throwable exception;
    protected volatile boolean done;
    protected boolean cancelled;

    public ResultFuture(final AsyncCallback<T> handler) {
        this.handler = handler;
    }

    public void setResult(T res) {
        result = res;

        if (handler != null) {
            handler.onCompleted(new Future<T>() {
                @Override
                public boolean cancel(boolean mayInterruptIfRunning) {
                    cancelled = true;
                    return true;
                }

                @Override
                public boolean isCancelled() {
                    return cancelled;
                }

                @Override
                public boolean isDone() {
                    return true;
                }

                @Override
                public T get() throws InterruptedException, ExecutionException {
                    return result;
                }

                @Override
                public T get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
                    return result;
                }
            });
        }

        done = true;

        synchronized (this) {
            notifyAll();
        }
    }

    @Override
    public boolean cancel(boolean mayInterruptIfRunning) {
        cancelled = true;

        synchronized (this) {
            notifyAll();
        }

        return true;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public boolean isDone() {
        return done;
    }

    @Override
    public T get() throws InterruptedException, ExecutionException {
        synchronized (this) {
            if (!done) {
                wait();
            }
        }

        if (cancelled) {
            throw new InterruptedException("Operation Cancelled");
        }

        if (exception != null) {
            throw new ExecutionException(exception);
        }

        return result;
    }

    @Override
    public T get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
    	synchronized (this) {
  	      	if (!done) {
	      	    unit.timedWait(this, timeout);
	        }
    	}
    		
    	if (!done) {
    		throw new TimeoutException("Operation timed out");
    	}
    	
        if (cancelled) {
            throw new InterruptedException("Operation Cancelled");
        }

        if (exception != null) {
            throw new ExecutionException(exception);
        }

        return result;
    }

    public void setException(final Throwable ex) {
        exception = ex instanceof ExecutionException
                ? ex.getCause()
                : ex;

        if (handler != null) {
            handler.onCompleted(new Future<T>() {
                @Override
                public boolean cancel(boolean mayInterruptIfRunning) {
                    cancelled = true;
                    return true;
                }

                @Override
                public boolean isCancelled() {
                    return cancelled;
                }

                @Override
                public boolean isDone() {
                    return true;
                }

                @Override
                public T get() throws InterruptedException, ExecutionException {
                    throw new ExecutionException(exception);
                }

                @Override
                public T get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
                    throw new ExecutionException(exception);
                }
            });
        }

        done = true;

        synchronized (this) {
            notifyAll();
        }
    }
}
