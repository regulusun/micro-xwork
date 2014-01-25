package com.opensymphony.xwork2.config.entities;

/**
 * Defines an object that can be used to retrieve interceptor configuration
 */
public interface InterceptorLocator {

    /**
     * Gets an interceptor configuration object.
     * @param name The interceptor or interceptor stack name
     * @return Either an {@link com.opensymphony.xwork3.config.entities.InterceptorConfig} or {@link com.opensymphony.xwork3.config.entities.InterceptorStackConfig} object
     */
    Object getInterceptorConfig(String name);
}
