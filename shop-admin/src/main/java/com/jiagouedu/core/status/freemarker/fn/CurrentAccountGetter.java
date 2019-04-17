package com.jiagouedu.core.status.freemarker.fn;

import freemarker.template.TemplateMethodModelEx;
import freemarker.template.TemplateModelException;
import com.jiagouedu.web.util.LoginUserHolder;

import java.util.List;

/**
 * 获取当前登录的用户(前端用户)
 * @author wukong 源码学院 Java互联网技术QQ群：940577921（备注：11）
 */
public class CurrentAccountGetter implements TemplateMethodModelEx {
    @Override
    public Object exec(List arguments) throws TemplateModelException {
        return LoginUserHolder.getLoginAccount();
    }
}
