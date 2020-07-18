package com.z5g.controller;

import com.alibaba.fastjson.JSONObject;
import com.z5g.base.BaseController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author JavaZ5G
 * @date 2020/6/21 5:28 PM
 */
@RestController
@RequestMapping("/")
public class LoginController extends BaseController {
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public JSONObject login(@RequestBody JSONObject jsonObject) {
        return new JSONObject();
    }
}
