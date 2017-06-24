package org.hz.school.controller;

import org.hz.school.model.Account;
import org.hz.school.resource.LoginResource;
import org.hz.school.util.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Administrator on 2017/6/24.
 */
@Controller
public class LoginController {
    private static Logger log= Logger.getLogger(LoginController.class);
    /**
     * 登录页面
     */
    @RequestMapping(value="/login",method= RequestMethod.GET)
    public String login(ModelMap model){
        model.addAttribute("message","Hello Spring mvc Framework");
        return "login/login";
    }
    /**
     * 登录页面
     */
    @RequestMapping(value="/loginRequest",method= RequestMethod.POST)
    public String loginRequest(String name,String password){
        log.info("--->>>>name:"+name+",password:"+password);
        String message= LoginResource.findAccount(name,password);
        if(message.equals("success")){
            return "index";
        }else {
            return "login/login";
        }
    }
    /**
     * 注册页面
     */
    @RequestMapping(value="/regist",method= RequestMethod.GET)
    public String regist(ModelMap model){
        model.addAttribute("message","Hello Spring mvc Framework");
        return "login/regist";
    }
}
