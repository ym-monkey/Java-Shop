package com.jiagouedu.core.freemarker.fn;

import freemarker.template.TemplateMethodModelEx;
import freemarker.template.TemplateModelException;
import com.jiagouedu.web.util.LoginUserHolder;

import java.util.List;

/**
 * 获取当前登录的用户
 * @author wukong 源码学院 Java互联网技术QQ群：940577921（备注：11）
 */
public class CurrentUserGetter implements TemplateMethodModelEx {
    @Override
    public Object exec(List arguments) throws TemplateModelException {
        return LoginUserHolder.getLoginUser();
    }
}
