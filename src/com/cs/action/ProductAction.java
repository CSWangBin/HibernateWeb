package com.cs.action;

import com.cs.bean.Product;
import com.cs.commom.bean.ControllerResult;
import com.cs.commom.bean.Pager4EasyUI;
import com.cs.sevice.ProductService;
import com.cs.sevice.ProductServiceImpl;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by 举 on 2016/11/28.
 */
public class ProductAction implements ServletRequestAware {
    private ProductService productService;
    private Product product;
    private int total; // 返回给easyui的总页数
    private List<Product> rows; // 返回给easyui的结果
    private ControllerResult result; //返回消息包装类

    private int id;

    private HttpServletRequest req;

    @Override
    public void setServletRequest(HttpServletRequest req) {
        this.req = req;
    }

    public ProductAction() {
        productService = new ProductServiceImpl();
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getTotal() {
        return total;
    }

    public List<Product> getRows() {
        return rows;
    }

    public ControllerResult getResult() {
        return result;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    /**
     * 添加商品
     * @return
     */
    public String add() {
        productService.add(product);
        result = ControllerResult.getResultSuccess("添加成功");
        return "add";
    }

    public String select() {
        return "select";
    }

    /**
     * 分页查询商品
     * @param
     * @return
     */
    public String queryAll() {
        String pageNoStr = req.getParameter("page");
        String pageSizeStr = req.getParameter("rows");
        Pager4EasyUI<Product> pager = new Pager4EasyUI<Product>();
        if (pageNoStr != null) {
            pager.setPageNo(Integer.valueOf(pageNoStr));
            pager.setPageSize(Integer.valueOf(pageSizeStr));
        }
        pager = productService.queryAll(pager);
        pager.setTotal(productService.count());
        rows = pager.getRows();
        total = pager.getTotal();
        return "all";
    }

    /**
     * 修改商品
     * @param
     */
    public String update() {
        productService.update(product);
        result = ControllerResult.getResultSuccess("更新成功");
        return "update";
    }

    /**
     * 删除商品
     * @param
     */
    public String deleteById() {
        productService.delete(id);
        result = ControllerResult.getResultSuccess("删除成功");
        return "delete";
    }
}
