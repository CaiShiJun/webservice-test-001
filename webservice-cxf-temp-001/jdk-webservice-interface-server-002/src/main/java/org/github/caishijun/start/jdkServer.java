package org.github.caishijun.start;

import org.github.caishijun.webservice.HelloWorld;
import org.github.caishijun.webservice.impl.HelloWorldImpl;

import javax.xml.ws.Endpoint;

public class jdkServer {

    public static void main(String[] args) {
        System.out.println("web service start");
        HelloWorld implementor = new HelloWorldImpl();
        String address = "http://localhost/helloWorld";
        Endpoint.publish(address, implementor);  // JDK实现
        System.out.println("web service started");

        //WSDL 地址：http://localhost/helloWorld?wsdl
    }

}
