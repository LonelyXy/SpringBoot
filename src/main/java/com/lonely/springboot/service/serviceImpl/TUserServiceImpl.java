package com.lonely.springboot.service.serviceImpl;

import com.lonely.springboot.dao.TUserMapper;
import com.lonely.springboot.pojo.TUser;
import com.lonely.springboot.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xyLonely
 * @date 2019/3/19 17:18
 */
@Service
public class TUserServiceImpl implements TUserService{

    @Autowired
    private TUserMapper tUserMapper;

    @Override
    public List<TUser> getAll() {
        return tUserMapper.selectAll();
    }
}
