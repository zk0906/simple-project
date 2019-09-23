package com.zk.ssmdemo.dao.imp;

import com.zk.ssmdemo.dao.UserDao;
import com.zk.ssmdemo.entity.User;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserDaoImpl implements UserDao {

    private SqlSession sqlSession;

    public UserDaoImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public User queryUserById(long id) {
        return this.sqlSession.selectOne("UserDao.queryUserById",1);
    }

    @Override
    public List<User> queryUserAll() {
        return this.sqlSession.selectList("UserDao.queryUserAll");
    }

    @Override
    public void insertUser(User user) {
        this.sqlSession.insert("UserDao.insertUser",user);
    }

    @Override
    public void updateUser(User user) {
        this.sqlSession.update("UserDao.updateUser",user);
    }

    @Override
    public void deleteUser(String id) {
        this.sqlSession.delete("UserDao.deleteUser",id);
    }

    @Override
    public User getById(int id) {
        return null;
    }
}
