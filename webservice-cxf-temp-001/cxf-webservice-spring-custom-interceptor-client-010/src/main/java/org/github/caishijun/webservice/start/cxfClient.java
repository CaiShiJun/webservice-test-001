package org.github.caishijun.webservice.start;

import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.github.caishijun.webservice.HelloWorld;
import org.github.caishijun.webservice.MyRole;
import org.github.caishijun.webservice.MyRoleArray;
import org.github.caishijun.webservice.Role;
import org.github.caishijun.webservice.impl.HelloWorldImplService;
import org.github.caishijun.webservice.interceptor.AddHeaderInterceptor;

import java.util.List;

public class cxfClient {

    public static void main(String[] args) {
        HelloWorldImplService service = new HelloWorldImplService();
        HelloWorld helloWorld = service.getHelloWorldImplPort();
        org.apache.cxf.endpoint.Client client = ClientProxy.getClient(helloWorld);
        // client.getInInterceptors().add(new LoggingInInterceptor()); // 添加in拦截器 日志拦截器
        client.getOutInterceptors().add(new AddHeaderInterceptor("java1234", "123456")); // 添加自定义拦截器
        client.getOutInterceptors().add(new LoggingOutInterceptor()); // 添加out拦截器
        //System.out.println(helloWorld.say("java1234"));
        /*User user=new User();
        user.setUserName("jack");
        user.setPassword("123456");
        List<Role> roleList=helloWorld.getRoleByUser(user);
        for(Role role:roleList){
            System.out.println(role.getId()+","+role.getRoleName());
        }*/
        MyRoleArray array = helloWorld.getRoles();
        List<MyRole> roleList = array.getItem();
        for (int i = 0; i < roleList.size(); i++) {
            MyRole my = roleList.get(i);
            System.out.print(my.getKey() + ":");
            for (Role r : my.getValue()) {
                System.out.print(r.getId() + "," + r.getRoleName() + " ");
            }
            System.out.println();
        }
    }

}
