package com.cs.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Created by 举 on 2016/11/29.
 */
/*
*
* 编写一个工具类得到SessionFactory
*/

public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        // Configuration类是负责读取hibernate.cfg.xml文件的一个类，解析此配置文件
        Configuration configuration = new Configuration().configure();
        // 由hibernate读取的配置文件来获取服务注册器
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        // 由服务注册器获取SessionFactory对象
        return configuration.buildSessionFactory(serviceRegistry);
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
