package com.cs.test;

import com.cs.bean.Product;
import com.cs.dao.ProductDAO;
import com.cs.dao.ProductDAOImpl;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.List;

/**
 * Created by 举 on 2016/11/29.
 */
public class DAOTest extends TestCase{

    private ProductDAO dao;

    @Override
    protected void setUp() throws Exception {
        dao = new ProductDAOImpl();
    }

    @Test
    public void testAdd() {
        Product product = new Product();
        product.setTitle("aa");
        product.setPrice(12);
        product.setDes("cc");
        dao.add(product);
    }

    @Test
    public void testQuery() {
        List<Product> list = dao.query();
        System.out.println("集合的数目"+list.size());
        for(Product p:list){
            System.out.println(p);
        }
    }

    @Test
    public void testQueryById() {
        Product p = dao.queryById(8);
        if (p != null) {
            System.out.println(p);
        }
    }

    @Test
    public void testUpdate() {
        Product p = dao.queryById(10);
        p.setTitle("wb");
        p.setPrice(55);
        p.setDes("hh");
        dao.update(p);
    }

    @Test
    public void testDelete(){
        dao.deleteById(11);
    }


}
