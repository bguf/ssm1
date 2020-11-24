package com.bguf.dao;

import com.bguf.entity.Log;
import com.bguf.entity.Tax;
import com.bguf.entity.TaxVO;
import com.bguf.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author
 * @Description
 * @Date 3:33 下午 2020/11/20
 */
@Mapper
public interface UserMapper
{
    public Integer login(User user);

    public void register(User user);

    void add(Tax tax);

    public List<Tax> query(TaxVO taxVO);

    void addLog(Log log);

    List<Log> loglist(Integer uid);
}
