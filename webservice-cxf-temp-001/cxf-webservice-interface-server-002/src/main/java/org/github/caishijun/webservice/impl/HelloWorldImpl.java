package org.github.caishijun.webservice.impl;

import org.github.caishijun.webservice.HelloWorld;

import javax.jws.WebService;

@WebService
public class HelloWorldImpl implements HelloWorld{

    public String say(String str) {
        return "Hello "+str;
    }

}
