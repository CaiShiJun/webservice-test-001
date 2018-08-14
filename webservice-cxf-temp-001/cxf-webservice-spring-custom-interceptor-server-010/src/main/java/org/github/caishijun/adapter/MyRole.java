package org.github.caishijun.adapter;

import java.util.List;

import org.github.caishijun.entity.Role;

/**
 * 自定义实体 cxf能接受
 * @author Administrator
 *
 */
public class MyRole {

    private String key;
    private List<Role> value;

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }
    public List<Role> getValue() {
        return value;
    }
    public void setValue(List<Role> value) {
        this.value = value;
    }
}