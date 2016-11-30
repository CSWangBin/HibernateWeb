package com.cs.service;

import com.cs.commom.bean.PageBean;

/**
 * Created by 举 on 2016/11/30.
 */
public interface ProductService {
    public PageBean queryForPage (int pageSize, int currentPage);
}
