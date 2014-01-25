/*
 * Copyright 2002-2007,2009 The Apache Software Foundation.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.opensymphony.xwork3;

import com.opensymphony.xwork3.config.Configuration;

import java.util.Map;


/**
 * Default factory for {@link ActionProxyFactory}.
 *
 * @author Jason Carreira
 */
public class DefaultActionProxyFactory implements ActionProxyFactory {

    private Configuration configuration;
    public DefaultActionProxyFactory() {
        super();
    }

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }
    
    /*@Inject
    public void setContainer(Container container) {
        this.container = container;
    }*/
    
    public ActionProxy createActionProxy(String namespace, String actionName, Map<String, Object> extraContext) {
        return createActionProxy(namespace, actionName, null, extraContext, true);
    }

    public ActionProxy createActionProxy(String namespace, String actionName, String methodName, Map<String, Object> extraContext) {
        return createActionProxy(namespace, actionName, methodName, extraContext, true);
    }

    public ActionProxy createActionProxy(String namespace, String actionName, Map<String, Object> extraContext, boolean cleanupContext) {
        return createActionProxy(namespace, actionName, null, extraContext, cleanupContext);
    }

    public ActionProxy createActionProxy(String namespace, String actionName, String methodName, Map<String, Object> extraContext, boolean cleanupContext) {
        
        ActionInvocation inv = new DefaultActionInvocation(extraContext, true);
//        container.inject(inv);
        return createActionProxy(inv, namespace, actionName, methodName, cleanupContext);
    }
    
    public ActionProxy createActionProxy(ActionInvocation inv, String namespace, String actionName, boolean cleanupContext) {
        
        return createActionProxy(inv, namespace, actionName, null, cleanupContext);
    }

    public ActionProxy createActionProxy(ActionInvocation inv, String namespace, String actionName, String methodName, boolean cleanupContext) {

        DefaultActionProxy proxy = new DefaultActionProxy(inv, namespace, actionName, methodName, cleanupContext);
//        container.inject(proxy);
        proxy.setConfiguration(configuration);
        proxy.prepare();
        return proxy;
    }

}
