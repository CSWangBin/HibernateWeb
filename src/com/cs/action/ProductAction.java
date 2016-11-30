package com.cs.action;

import com.cs.commom.bean.PageBean;
import com.cs.service.ProductService;
import com.cs.service.ProductServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by 举 on 2016/11/30.
 */
public class ProductAction extends ActionSupport{

    private int page;
    private PageBean pageBean;
    public ProductService productService;



    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public PageBean getPageBean() {
        return pageBean;
    }

    public void setPageBean(PageBean pageBean) {
        this.pageBean = pageBean;
    }

    public ProductAction() {
        productService = new ProductServiceImpl();
    }

    public String all() {
        pageBean = productService.queryForPage(6, page);
        return "all";
    }
}
