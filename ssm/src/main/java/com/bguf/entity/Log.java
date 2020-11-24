package com.bguf.entity;

/**
 * @Author
 * @Description
 * @Date 3:56 下午 2020/11/23
 */
public class Log
{
    private Integer id;
    private String type;
    private String date;
    private Integer uid;

    public Log()
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

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getDate()
    {
        return date;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public Integer getUid()
    {
        return uid;
    }

    public void setUid(Integer uid)
    {
        this.uid = uid;
    }
}
