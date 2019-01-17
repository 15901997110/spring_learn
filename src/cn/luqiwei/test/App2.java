package cn.luqiwei.test;

import cn.luqiwei.chapter2.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/12/18 10:37
 */
public class App2 {
    public static void main(String[] args) {
        ApplicationContext  context=new ClassPathXmlApplicationContext("applicationContext_annotation.xml");
        UserService userService =(UserService) context.getBean("userServiceImpl");
        userService.save();
    }
}
