package com.forsrc.boot.web.user.service.impl;

import com.forsrc.boot.web.user.dao.UserDao;
import com.forsrc.boot.web.user.service.UserService;
import com.forsrc.pojo.User;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class UserServicImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public void delete(User user) {
        userDao.delete(user);
    }

    @Override
    public User get(long id) {
        return userDao.get(id);
    }

    @Override
    public List<User> get(int start, int size) {
        return userDao.get(start, size);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }
}
