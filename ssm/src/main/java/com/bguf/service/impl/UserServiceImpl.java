package com.bguf.service.impl;

import com.bguf.dao.UserMapper;
import com.bguf.entity.Log;
import com.bguf.entity.Tax;
import com.bguf.entity.TaxVO;
import com.bguf.entity.User;
import com.bguf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author
 * @Description
 * @Date 3:33 下午 2020/11/20
 */
@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional
    public Integer login(User user)
    {
        return userMapper.login(user);
    }

    @Override
    @Transactional
    public void register(User user)
    {
        userMapper.register(user);
    }

    @Override
    public List<Tax> query(TaxVO taxVO)
    {
        List<Tax> list = userMapper.query(taxVO);
        return list;
    }

    @Override
    public List<Log> loglist(Integer uid)
    {
        return userMapper.loglist(uid);
    }

    @Transactional
    @Override
    public void addLog(Log log, Tax tax)
    {
        userMapper.add(tax);
        userMapper.addLog(log);
    }
}
