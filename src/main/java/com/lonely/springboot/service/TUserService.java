package com.lonely.springboot.service;

import com.lonely.springboot.pojo.TUser;

import java.util.List;

/**
 * @author xyLonely
 * @date 2019/3/19 17:18
 */
public interface TUserService {

    List<TUser> getAll();
}
