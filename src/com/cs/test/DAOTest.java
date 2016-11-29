package com.cs.test;

import com.cs.bean.Product;
import com.cs.dao.ProductDAO;
import com.cs.dao.ProductDAOImpl;
import junit.framework.TestCase;
import org.junit.Test;

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
    public void testQueryById() {
        Product p = dao.queryById(1);
        if (p != null) {
            System.out.println(p);
        }
    }

    @Test
    public void text() {
        System.out.print("aaaaaaaaaaaaaaaaaa");
    }

}
