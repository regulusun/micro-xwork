package com.opensymphony.xwork2;

import com.opensymphony.xwork3.FileManager;

/**
 * Factory that creates FileManager, default to {@link com.opensymphony.xwork3.util.fs.DefaultFileManager}
 */
public interface FileManagerFactory {

    void setReloadingConfigs(String reloadingConfigs);

    FileManager getFileManager();

}
