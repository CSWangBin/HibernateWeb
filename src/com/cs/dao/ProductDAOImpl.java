package com.cs.dao;

import com.cs.bean.Product;
import com.cs.commom.bean.Pager4EasyUI;
import com.cs.util.HibernateUtil;
import org.hibernate.*;
import org.hibernate.criterion.Projections;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 举 on 2016/11/29.
 */
public class ProductDAOImpl implements ProductDAO {

    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    /**
     * 添加商品
     * @param product
     * @return
     */
    @Override
    public Product add(Product product) {
        Session session = sessionFactory.openSession();
        Transaction tran = session.beginTransaction();//开始事物
        session.save(product);//执行
        tran.commit();//提交
        session.close();
        return product;
    }

    /**
     * 分页查询商品
     * @param pager
     * @return
     */
    @Override
    public Pager4EasyUI<Product> queryAll(Pager4EasyUI<Product> pager){
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from Product ");
        query.setFirstResult(pager.getBeginIndex());
        query.setMaxResults(pager.getPageSize());
        List<Product> products = query.list();
        pager.setRows(products);
        session.close();
        return pager;
    }

    /**
     * 查询商品总数
     * @return
     */
    public int count() {
        Session session = sessionFactory.openSession();
        Query query = session.createSQLQuery("select count(*) from t_product1");
        BigInteger count = (BigInteger) query.uniqueResult();
        session.close();
        return count.intValue();
    }


    /**
     * 修改商品
     * @param product
     */
    @Override
    public void update(Product product) {
        Session session = sessionFactory.openSession();
        Transaction tran = session.beginTransaction();//开始事物
        session.update(product); //修改对象
        tran.commit();//提交
        session.close();
    }

    /**
     * 删除商品
     * @param id
     */
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
