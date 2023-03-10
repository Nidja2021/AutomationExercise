package com.automationexercise.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
    Properties properties;

    public ReadConfig() {
        File file = new File("./Configuration/config.properties");

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (Exception e) {
            System.out.println("Exception is: " + e.getMessage());
        }
    }

    public String getApplicationURL() {
        return properties.getProperty("baseURL");
    }

    public String getUsername() {
        return properties.getProperty("username");
    }

    public String getPassword() {
        return properties.getProperty("password");
    }

    public String getChromePath() {
        return properties.getProperty("chromepath");
    }

    public String getFirefoxPath() {
        return properties.getProperty("firefoxpath");
    }
}
