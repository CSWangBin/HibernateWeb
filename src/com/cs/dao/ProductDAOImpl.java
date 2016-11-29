package com.cs.dao;

import com.cs.bean.Product;
import com.cs.commom.bean.Pager4EasyUI;
import com.cs.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by 举 on 2016/11/29.
 */
public class ProductDAOImpl implements ProductDAO {

    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    @Override
    public Product add(Product product) {
        Session session = sessionFactory.openSession();
        Transaction tran = session.beginTransaction();//开始事物
        session.save(product);//执行
        tran.commit();//提交
        session.close();
        return product;
    }


    @Override
    public List<Product> query() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List<Product> list=session.createQuery("from Product").list();
        session.getTransaction().commit();
        session.close();
        return list;
    }

    @Override
    public Pager4EasyUI<Product> queryAll(Pager4EasyUI<Product> pager) {
        return null;
    }

    @Override
    public Product queryById(int id) {
        Session session = sessionFactory.openSession();
        Product p = (Product)session.get(Product.class, id);
        session.close();
        return p;
    }

    @Override
    public void update(Product product) {
        Session session = sessionFactory.openSession();
        Transaction tran = session.beginTransaction();//开始事物
        session.update(product); //修改对象
        tran.commit();//提交
        session.close();
    }

    @Override
    public void delete(Product product) {

    }

    @Override
    public void deleteById(int id) {
        Session session = sessionFactory.openSession();
        Transaction tran = session.beginTransaction();//开始事物
        Product p = (Product)session.get(Product.class, id); //获取id
        System.out.print(p);
        session.delete(p);
        tran.commit();//提交
        session.close();
    }
}
