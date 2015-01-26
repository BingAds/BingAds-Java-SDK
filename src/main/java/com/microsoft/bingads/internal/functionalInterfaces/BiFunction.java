/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microsoft.bingads.internal.functionalinterfaces;

public interface BiFunction<T, U, R> {

    R apply(T t, U u);
}
