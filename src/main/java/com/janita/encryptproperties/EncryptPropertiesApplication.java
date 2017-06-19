package com.janita.encryptproperties;

import com.janita.encryptproperties.config.DbConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(DbConfig.class)
public class EncryptPropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EncryptPropertiesApplication.class, args);
	}
}
