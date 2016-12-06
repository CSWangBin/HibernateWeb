package com.cs.sevice;

import com.cs.commom.bean.Pager4EasyUI;
import com.cs.dao.AdminDAO;
import com.cs.dao.AdminDAOImpl;

/**
 * Created by 举 on 2016/11/28.
 */
public class ProductServiceImpl implements ProductService {

    private AdminDAO productDAO;

    public ProductServiceImpl() {
        productDAO = new AdminDAOImpl();
    }

    /**
     * 添加商品
     * @param product
     * @return
     */
    @Override
    public Product add(Product product) {
        return productDAO.add(product);
    }

    /**
     * 分页查询商品
     * @param pager
     * @return
     */
    @Override
    public Pager4EasyUI<Product> queryAll(Pager4EasyUI<Product> pager) {
        return productDAO.queryAll(pager);
    }


    /**
     * 查询商品总数
     * @return
     */
    @Override
    public int count() {
        return productDAO.count();
    }

    /**
     * 修改商品
     * @param product
     */
    @Override
    public void update(Product product) {
        productDAO.update(product);
    }

    /**
     * 删除商品
     * @param id
     */
    @Override
    public void delete(int id) {
        productDAO.deleteById(id);
    }


}
