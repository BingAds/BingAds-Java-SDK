/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microsoft.bingads;

import java.text.ParseException;

public class UncheckedParseException extends RuntimeException {
    public UncheckedParseException(ParseException cause) {
        super(cause);
    }
}
