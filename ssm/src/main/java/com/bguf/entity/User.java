package com.bguf.entity;

/**
 * @Author
 * @Description
 * @Date 3:31 下午 2020/11/20
 */
public class User
{
    private Integer id;
    private String name;
    private String pwd;

    public User()
    {
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getPwd()
    {
        return pwd;
    }

    public void setPwd(String pwd)
    {
        this.pwd = pwd;
    }
}
