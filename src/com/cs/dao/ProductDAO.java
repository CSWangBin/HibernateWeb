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
    //分页查询
    public List<Product> queryForPage(String hql,int offset,int length);
    //总记录条数
    public int getCount(String hql);
    public Product queryById(int id);
    public void update(Product product);
    public void delete(Product product);
    public void deleteById(int id);
}
