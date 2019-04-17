package com.jiagouedu.web.action.manage.express;import com.jiagouedu.core.dao.page.PagerModel;import com.jiagouedu.services.manage.express.ExpressService;import com.jiagouedu.services.manage.express.bean.Express;import com.jiagouedu.web.action.BaseController;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.stereotype.Controller;import org.springframework.web.bind.annotation.RequestMapping;/** * 配送方式管理 * @author wukong 源码学院 Java互联网技术QQ群：940577921（备注：11） */@Controller@RequestMapping("/manage/express/")public class ExpressAction extends BaseController<Express> {    private static final long serialVersionUID = 1L;    @Autowired    private ExpressService expressService;    public ExpressAction() {        super.page_toList = "/manage/express/expressList";        super.page_toEdit = "/manage/express/expressEdit";        super.page_toAdd = "/manage/express/expressEdit";    }    @Override    public ExpressService getService() {        return expressService;    }    @Override    protected void selectListAfter(PagerModel pager) {        pager.setPagerUrl("selectList");    }    @Override    public void insertAfter(Express e) {        e.clear();    }    public void setExpressService(ExpressService expressService) {        this.expressService = expressService;    }}