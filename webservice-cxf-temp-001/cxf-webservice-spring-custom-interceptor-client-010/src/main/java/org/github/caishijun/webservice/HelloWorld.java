package org.github.caishijun.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.6
 * 2018-08-14T20:42:16.618+08:00
 * Generated source version: 3.2.6
 *
 */
@WebService(targetNamespace = "http://webservice.caishijun.github.org/", name = "HelloWorld")
@XmlSeeAlso({ObjectFactory.class})
public interface HelloWorld {

    @WebMethod
    @RequestWrapper(localName = "getRoles", targetNamespace = "http://webservice.caishijun.github.org/", className = "org.github.caishijun.webservice.GetRoles")
    @ResponseWrapper(localName = "getRolesResponse", targetNamespace = "http://webservice.caishijun.github.org/", className = "org.github.caishijun.webservice.GetRolesResponse")
    @WebResult(name = "return", targetNamespace = "")
    public org.github.caishijun.webservice.MyRoleArray getRoles();

    @WebMethod
    @RequestWrapper(localName = "say", targetNamespace = "http://webservice.caishijun.github.org/", className = "org.github.caishijun.webservice.Say")
    @ResponseWrapper(localName = "sayResponse", targetNamespace = "http://webservice.caishijun.github.org/", className = "org.github.caishijun.webservice.SayResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String say(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebMethod
    @RequestWrapper(localName = "getRoleByUser", targetNamespace = "http://webservice.caishijun.github.org/", className = "org.github.caishijun.webservice.GetRoleByUser")
    @ResponseWrapper(localName = "getRoleByUserResponse", targetNamespace = "http://webservice.caishijun.github.org/", className = "org.github.caishijun.webservice.GetRoleByUserResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<org.github.caishijun.webservice.Role> getRoleByUser(
        @WebParam(name = "arg0", targetNamespace = "")
        org.github.caishijun.webservice.User arg0
    );
}
