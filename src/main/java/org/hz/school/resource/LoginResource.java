package org.hz.school.resource;

import org.hz.school.controller.LoginController;
import org.hz.school.model.Account;
import org.hz.school.util.EbeanUtil;
import org.hz.school.util.Logger;
import org.hz.school.util.StringUtil;

/**
 * Created by Administrator on 2017/6/24.
 */
public class LoginResource {
    private static Logger log= Logger.getLogger(LoginResource.class);
    /**
     * 用户登录
     */
    public static String findAccount(String name,String password){
        if(StringUtil.isEmpty(name) || StringUtil.isEmpty(password))return "用户名或密码不能为空";
        Account account= EbeanUtil.find(Account.class).where().eq("name",name).setMaxRows(1).findUnique();
        return checkLogin(account);
    }
    private static String checkLogin(Account account){
        Long lockTime=account.getLockTime();
        Long now=System.currentTimeMillis();
        Long longTime=(lockTime+1*60*60*3600)-now;
        if(lockTime==-1){
            return "临时锁定："+account.getLockReason();
        }
        if(lockTime!=0 && lockTime>=0){
            return "账号锁定，请于"+longTime/3600/60+"分钟后再试";
        }


    }
}
