package com.opensymphony.xwork2.util.reflection;

import com.opensymphony.xwork3.util.reflection.ReflectionException;

/**
 * Declares a class that wants to handle its own reflection exceptions
 */
public interface ReflectionExceptionHandler {

    /**
     * Handles a reflection exception
     * 
     * @param ex The reflection exception
     */
    void handle(ReflectionException ex);
}
