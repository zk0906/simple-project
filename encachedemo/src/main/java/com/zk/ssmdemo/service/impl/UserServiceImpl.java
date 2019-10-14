package com.zk.ssmdemo.service.impl;

import com.zk.ssmdemo.dao.UserDao;
import com.zk.ssmdemo.pojo.User;
import com.zk.ssmdemo.service.UserService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Transactional
@Service("userService")
public class UserServiceImpl implements UserService {

    /**
     * 因为没有在spring的文件中显式的声明userService实现类，直接通过getBean得到 userService 会找不到
     *  需要显式配置 @Service ("userService")，指定bean的名称
     *  相当与<bean id="userService" class="com.jxust.ssm.service.impl.UserServiceImpl"></bean>
     */
    @Resource
    private UserDao userDao;

    @Override
    @Cacheable(value = "cacaheTest")
    public User getUserById(Integer userid) {
        return this.userDao.selectByPrimaryKey(userid);
    }

    @Override
    public int insert(User user) {
        return this.userDao.insert(user);
    }
}
