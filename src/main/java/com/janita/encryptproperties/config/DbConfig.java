package com.janita.encryptproperties.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Janita on 2017/6/19 0019-上午 10:50
 * 该类是：
 */
@ConfigurationProperties(prefix = "db")
public class DbConfig {

    private static String username;
    private static String password;

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        DbConfig.username = username;
        System.out.println("\n***** : " + username);
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        DbConfig.password = password;
        System.out.println("\n***** : " + password);
    }
}
