package org.github.caishijun.webservice;

import org.github.caishijun.entity.Role;
import org.github.caishijun.entity.User;

import javax.jws.WebService;
import java.util.List;

@WebService
public interface HelloWorld {

    public String say(String str);

    public List<Role> getRoleByUser(User user);
}