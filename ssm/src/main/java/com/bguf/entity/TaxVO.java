package com.bguf.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Author
 * @Description
 * @Date 10:12 上午 2020/11/23
 */
public class TaxVO
{
    private Integer uid;
    private String date1;
    private String date2;
    private Double money1;
    private Double money2;


    public TaxVO()
    {
    }

    public TaxVO(Integer uid, String date1, String date2, Double money1, Double money2)
    {
        this.uid = uid;
        this.date1 = date1;
        this.date2 = date2;
        this.money1 = money1;
        this.money2 = money2;
    }

    public Integer getUid()
    {
        return uid;
    }

    public void setUid(Integer uid)
    {
        this.uid = uid;
    }

    public String getDate1()
    {
        return date1;
    }

    public void setDate1(String date1)
    {
        this.date1 = date1;
    }

    public String getDate2()
    {
        return date2;
    }

    public void setDate2(String date2)
    {
        this.date2 = date2;
    }

    public Double getMoney1()
    {
        return money1;
    }

    public void setMoney1(Double money1)
    {
        this.money1 = money1;
    }

    public Double getMoney2()
    {
        return money2;
    }

    public void setMoney2(Double money2)
    {
        this.money2 = money2;
    }
}
