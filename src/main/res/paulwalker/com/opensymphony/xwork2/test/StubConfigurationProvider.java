package com.opensymphony.xwork2.test;

import com.opensymphony.xwork3.config.Configuration;
import com.opensymphony.xwork3.config.ConfigurationException;
import com.opensymphony.xwork3.config.ConfigurationProvider;
import com.opensymphony.xwork2.inject.ContainerBuilder;
import com.opensymphony.xwork3.util.location.LocatableProperties;

public class StubConfigurationProvider implements ConfigurationProvider {

    public void destroy() {
        // TODO Auto-generated method stub

    }

    public void init(Configuration configuration) throws ConfigurationException {
        // TODO Auto-generated method stub
    }

    public void loadPackages() throws ConfigurationException {
        // TODO Auto-generated method stub

    }

    public boolean needsReload() {
        // TODO Auto-generated method stub
        return false;
    }

    public void register(ContainerBuilder builder, LocatableProperties props)
            throws ConfigurationException {
        // TODO Auto-generated method stub

    }

}
