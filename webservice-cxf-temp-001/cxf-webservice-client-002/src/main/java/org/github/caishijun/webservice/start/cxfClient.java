package org.github.caishijun.webservice.start;

import org.github.caishijun.webservice.HelloWorld;
import org.github.caishijun.webservice.HelloWorldService;

public class cxfClient {

    public static void main(String[] args) {
        HelloWorldService service=new HelloWorldService();
        HelloWorld helloWorld=service.getHelloWorldPort();
        System.out.println(helloWorld.say("HelloWorld"));
    }

}
