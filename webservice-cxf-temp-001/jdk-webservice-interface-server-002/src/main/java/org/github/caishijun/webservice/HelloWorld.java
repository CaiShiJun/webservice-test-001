package org.github.caishijun.webservice;

import javax.jws.WebService;

@WebService
public interface HelloWorld {

    public String say(String str);

}