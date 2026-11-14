package com.microsoft.bingads.internal.utilities;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Reserved for internal use.
 *
 * <p>
 * Executes blocking file transfers (uploads, downloads and extraction of result files) of the service managers.
 * </p>
 *
 * <p>
 * The callbacks of the asynchronous service operations are invoked on a thread of the HTTP client.
 * That thread pool is bounded, so blocking one of its threads for the duration of a file transfer
 * starves the response handling of all other asynchronous requests and may block callers of
 * the asynchronous service operations. Therefore file transfers have to be executed on these threads instead.
 * </p>
 */
public final class FileTransferExecutor {

    private static final ExecutorService EXECUTOR = Executors.newCachedThreadPool(new ThreadFactory() {
        private final AtomicInteger counter = new AtomicInteger();

        @Override
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "BingAdsSDK-FileTransfer-" + counter.incrementAndGet());
            thread.setDaemon(true);
            return thread;
        }
    });

    private FileTransferExecutor() {
    }

    /**
     * Executes the given task on a file transfer thread.
     *
     * @param task the task to execute
     */
    public static void execute(Runnable task) {
        EXECUTOR.execute(task);
    }
}
