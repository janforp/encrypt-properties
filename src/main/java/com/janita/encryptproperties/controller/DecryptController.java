package com.janita.encryptproperties.controller;

import com.janita.encryptproperties.config.DbConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Janita on 2017/6/19 0019-上午 11:13
 * 该类是：
 */
@RestController
@RequestMapping("/decrypt")
public class DecryptController {

    @GetMapping
    public String decrypt() {
        return DbConfig.getPassword();
    }
}
