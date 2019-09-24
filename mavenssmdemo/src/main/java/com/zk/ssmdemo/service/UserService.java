package com.zk.ssmdemo.service;

import com.zk.ssmdemo.pojo.User;

public interface UserService {

    //根据id查找
    public User getUserById(Integer userid);

    //添加一条数据
    public int insert(User user);
}
