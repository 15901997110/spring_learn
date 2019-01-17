package cn.luqiwei.chapter2;

import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/12/18 10:34
 */
@Component
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("数据保存成功...");
    }
}
