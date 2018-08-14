package org.github.caishijun.webservice.start;

import org.github.caishijun.webservice.HelloWorld;
import org.github.caishijun.webservice.HelloWorldService;
import org.github.caishijun.webservice.Role;
import org.github.caishijun.webservice.User;

import java.util.List;

public class cxfClient {

    public static void main(String[] args) {
        HelloWorldService service=new HelloWorldService();
        HelloWorld helloWorld=service.getHelloWorldPort();
        //System.out.println(helloWorld.say("java1234"));
        User user=new User();
        user.setUserName("jack");
        user.setPassword("123456");
        List<Role> roleList=helloWorld.getRoleByUser(user);
        for(Role role:roleList){
            System.out.println(role.getId()+","+role.getRoleName());
        }
    }
}
