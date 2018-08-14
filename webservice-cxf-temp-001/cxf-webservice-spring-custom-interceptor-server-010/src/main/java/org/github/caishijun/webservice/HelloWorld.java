package org.github.caishijun.webservice;

import org.github.caishijun.adapter.MapAdapter;
import org.github.caishijun.entity.Role;
import org.github.caishijun.entity.User;

import javax.jws.WebService;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.List;
import java.util.Map;

@WebService
public interface HelloWorld {

    public String say(String str);

    public List<Role> getRoleByUser(User user);

    /**
     * 获取所有用户以及对应的角色
     * @return
     */
    @XmlJavaTypeAdapter(MapAdapter.class)
    public Map<String,List<Role>> getRoles();
}