package com.cs.sevice;

import com.cs.bean.Product;
import com.cs.commom.bean.Pager4EasyUI;

/**
 * Created by 举 on 2016/11/28.
 */
public interface ProductService {

    /**
     * 添加商品
     * @param product
     * @return
     */
    public Product add(Product product);


    /**
     * 分页查询商品
     * @param pager
     * @return
     */
    public Pager4EasyUI<Product> queryAll(Pager4EasyUI<Product> pager);

    /**
     * 查询商品总数
     * @return
     */
    public int count();

    /**
     * 修改商品
     * @param product
     */
    public void update(Product product);

    /**
     * 删除商品
     * @param id
     */
    public void delete(int id);


}
