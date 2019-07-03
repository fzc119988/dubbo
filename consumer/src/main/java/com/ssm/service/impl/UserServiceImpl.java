package com.ssm.service.impl;



import com.alibaba.dubbo.config.annotation.Service;
import com.ssm.mapper.UserMapper;
import com.ssm.model.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    /**
     * ע��UserMapper�ӿ�
     */
    @Autowired(required=true)
    private UserMapper userMapper;
 
    /**
     * �����û�
     */
    public void saveUser(User user) {
        userMapper.saveUser(user);
    }

    /**
     * �����û�
     */
    public boolean updateUser(User user) {
        return userMapper.updateUser(user);
    }

    /**
     * ����Idɾ���û�
     */
    public boolean deleteUser(int id) {
        return userMapper.deleteUser(id);
    }

    /**
     * ����id�����û�
     */
    public User findUserById(int id) {
        User user = userMapper.findUserById(id);
        return user;
    }

    /**
     * ��ѯ�����û�
     */
    public List<User> findAll() {
        List<User> allUser = userMapper.findAll();
        return allUser;
    }

}

