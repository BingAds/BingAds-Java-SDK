/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microsoft.bingads;

/**
 * This exception will be thrown if the SDK cannot perform some task due to an internal error.
 */
public class InternalException extends RuntimeException {
    public InternalException(Throwable cause) {
        super("Internal BingAds SDK exception has occured", cause);
    }
}
