package cn.fund123.lion.transport;

import com.opensymphony.xwork3.XWork;
import com.opensymphony.xwork3.config.Configuration;
import com.opensymphony.xwork3.config.ConfigurationManager;
import com.opensymphony.xwork3.config.providers.XmlConfigurationProvider;

/**
 * @author paulwalker4rip@gmail.com
 * @version 1/24/14 Time: 4:01 PM
 */
public class Main {
    public static void main(String[] args) {
        ConfigurationManager configurationManager = new ConfigurationManager();
        configurationManager.addContainerProvider(new XmlConfigurationProvider("xwork.xml", false));
        Configuration config = configurationManager.getConfiguration();

        XWork work = new XWork(configurationManager);
        work.executeAction("base", "hello", "execute");

    }
}
