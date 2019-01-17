package cn.luqiwei.chapter1.service.impl;

import cn.luqiwei.chapter1.dao.UserDao;
import cn.luqiwei.chapter1.service.UserService;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/12/17 19:59
 */
public class UserServiceImpl implements UserService {

    public UserServiceImpl() {
    }


    private UserDao userDao;

    public void setGender(String gender) {
        this.gender = gender;
    }

    private String gender;

    /**
     * 使用springIOC容器的依赖注入
     * 1.构造方法注入参数
     */
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    /**
     * 2.setter方法注入
     */
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        userDao.save();
        System.out.println(this.gender);
    }
}
