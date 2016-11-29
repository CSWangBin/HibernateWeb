package com.cs.dao;

import com.cs.bean.Product;
import com.cs.commom.bean.Pager4EasyUI;

import java.util.List;

/**
 * Created by 举 on 2016/11/29.
 */
public interface ProductDAO {
    public Product add(Product product);
    public List<Product> query();
    public Pager4EasyUI<Product> queryAll(Pager4EasyUI<Product> pager);
    public Product queryById(int id);
    public void update(Product product);
    public void delete(Product product);
    public void deleteById(int id);
}
