package cn.luqiwei.chapter1.dao.impl;

import cn.luqiwei.chapter1.dao.UserDao;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/12/18 9:33
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("userDaoImpl,数据保存成功");
    }
}
