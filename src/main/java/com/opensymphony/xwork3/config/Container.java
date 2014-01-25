package com.opensymphony.xwork3.config;

import java.util.HashMap;
import java.util.Map;

/**
 * @author paulwalker4rip@gmail.com
 * @version 1/24/14 Time: 11:38 AM
 */
public class Container {
    private static final Container instance = new Container();
    private Container() {}
    public static Container getInstance() {return instance;}

    private Map<String, Object> constants = new HashMap<String, Object>();
    //scope:prototype
    //ognlutil工具类 拷贝出另一个bean
    private Map<String, Object> beans = new HashMap<String, Object>();

    public Map<String, Object> getConstants() {
        return constants;
    }

    public Map<String, Object> getBeans() {
        return beans;
    }
}
