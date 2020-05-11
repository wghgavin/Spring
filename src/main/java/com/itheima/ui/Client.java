package com.itheima.ui;

import com.itheima.service.IAccountService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    static int a =0;
    int b =1;
    public void func(){

    }
    public static void main(String[] args) {
        try {
            ApplicationContext ac =new ClassPathXmlApplicationContext("bean.xml");
        } catch (BeansException e) {
            e.printStackTrace();
        }
    }
}
