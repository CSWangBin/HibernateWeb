package com.cs.dao;

import com.cs.bean.Product;
import com.cs.commom.bean.Pager4EasyUI;
import com.cs.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Created by 举 on 2016/11/29.
 */
public class ProductDAOImpl implements ProductDAO {

    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    @Override
    public Product add(Product product) {
        return null;
    }

    @Override
    public Product query(Product product) {
        return null;
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

    }

    @Override
    public void delete(Product product) {

    }

    @Override
    public void deleteById(int id) {

    }
}
