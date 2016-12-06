package com.cs.dao;

import com.cs.bean.Admin;
import com.cs.commom.bean.Pager4EasyUI;

/**
 * Created by 举 on 2016/11/29.
 */
public interface AdminDAO {
    /**
     * 添加关了一天
     * @param admin
     * @return
     */
    public AdminDAO add(Admin admin);

    /**
     * 分页查询管理员
     * @param pager
     * @return
     */
    public Pager4EasyUI<Admin> queryAll(Pager4EasyUI<Admin> pager);

    /**
     * 查询商品总数
     * @return
     */
    public int count();

    /**
     * 修改管理员
     * @param product
     */
    public void update(Admin product);

    /**
     * 删除管理员
     * @param id
     */
    public void deleteById(int id);
}
