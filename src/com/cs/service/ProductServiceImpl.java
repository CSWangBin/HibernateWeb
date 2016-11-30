package com.cs.service;

import com.cs.bean.Product;
import com.cs.commom.bean.PageBean;
import com.cs.dao.ProductDAO;
import com.cs.dao.ProductDAOImpl;

import java.util.List;

/**
 * Created by 举 on 2016/11/30.
 */
public class ProductServiceImpl implements ProductService {

    private ProductDAO productDAO;

    public ProductServiceImpl() {
        productDAO = new ProductDAOImpl();
    }

    @Override
    public PageBean queryForPage(int pageSize, int page) {
        String hql = "select count(*) from t_product1";
        int count = productDAO.getCount(hql);
        int totalPage = PageBean.countTotalPage(pageSize, count); //总页数
        int offset = PageBean.countOffset(pageSize, page); //当前页开始记录
        int length = pageSize; //每页记录数
        int currentPage = PageBean.countCurrentPage(page);
        List<Product> products = productDAO.queryForPage("from Product", offset, length);

        //把分页保存在PageBean中
        PageBean pageBean = new PageBean();
        pageBean.setPageSize(pageSize);
        pageBean.setCurrentPage(currentPage);
        pageBean.setAllRow(count);
        pageBean.setTotalPage(totalPage);
        pageBean.setList(products);
        pageBean.init();
        return pageBean;
    }
}
