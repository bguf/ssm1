package com.bguf.service;

import com.bguf.entity.Log;
import com.bguf.entity.Tax;
import com.bguf.entity.TaxVO;
import com.bguf.entity.User;

import java.util.List;

/**
 * @Author
 * @Description
 * @Date 3:33 下午 2020/11/20
 */
public interface UserService
{
    public Integer login(User user);
    public void register(User user);
    List<Tax> query(TaxVO taxVO);
    void addLog(Log log, Tax tax);
    List<Log> loglist(Integer uid);
}
