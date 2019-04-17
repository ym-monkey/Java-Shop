package com.jiagouedu.core.freemarker.fn;

import freemarker.template.TemplateMethodModelEx;
import freemarker.template.TemplateModelException;
import com.jiagouedu.core.FrontContainer;
import com.jiagouedu.web.util.RequestHolder;

import java.util.List;

/**
 * 获取购物车
 * @author wukong 源码学院 Java互联网技术QQ群：940577921（备注：11）
 */
public class ShoppingCartGetter implements TemplateMethodModelEx {
    @Override
    public Object exec(List arguments) throws TemplateModelException {
        return RequestHolder.getSession().getAttribute(FrontContainer.myCart);
    }
}
