package org.github.caishijun.webservice.impl;

import org.github.caishijun.entity.Role;
import org.github.caishijun.entity.User;
import org.github.caishijun.webservice.HelloWorld;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService
public class HelloWorldImpl implements HelloWorld{

    public String say(String str) {
        return "Hello "+str;
    }

    public List<Role> getRoleByUser(User user) {
        List<Role> roleList=new ArrayList<Role>();
        // 模拟 直接写死
        if(user!=null){
            if(user.getUserName().equals("java1234") && user.getPassword().equals("123456")){
                roleList.add(new Role(1,"技术总监"));
                roleList.add(new Role(2,"架构师"));
            }else if(user.getUserName().equals("jack") && user.getPassword().equals("123456")){
                roleList.add(new Role(3,"程序员"));
            }
            return roleList;
        }else{
            return null;
        }
    }
}
