package com.opensymphony.xwork2.util.reflection;

import com.opensymphony.xwork3.ActionContext;
import com.opensymphony.xwork3.util.reflection.ReflectionProvider;

public class ReflectionProviderFactory {

    public static ReflectionProvider getInstance() {
        return ActionContext.getContext().getContainer().getInstance(ReflectionProvider.class);
    }
}
