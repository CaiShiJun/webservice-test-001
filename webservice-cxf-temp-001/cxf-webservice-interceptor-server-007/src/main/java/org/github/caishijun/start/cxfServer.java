package org.github.caishijun.start;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.github.caishijun.webservice.HelloWorld;
import org.github.caishijun.webservice.impl.HelloWorldImpl;

public class cxfServer {

    public static void main(String[] args) {
        System.out.println("web service start");
        HelloWorld implementor = new HelloWorldImpl();
        String address = "http://localhost/helloWorld";
        JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
        factoryBean.setAddress(address); // 设置暴露地址
        factoryBean.setServiceClass(HelloWorld.class); // 接口类
        factoryBean.setServiceBean(implementor); // 设置实现类
        factoryBean.getInInterceptors().add(new LoggingInInterceptor()); // 添加in拦截器 日志拦截器
        factoryBean.getOutInterceptors().add(new LoggingOutInterceptor()); // 添加out拦截器
        factoryBean.create();
        System.out.println("web service started");

        //WSDL 地址：http://localhost/helloWorld?wsdl
    }

}
