package com.lonely.springboot.dao;

import com.lonely.springboot.pojo.TUser;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TUser record);

    TUser selectByPrimaryKey(Integer id);

    List<TUser> selectAll();

    int updateByPrimaryKey(TUser record);
}