package com.jiagouedu.core.status.freemarker.fn;

import freemarker.template.TemplateMethodModelEx;
import freemarker.template.TemplateModelException;
import com.jiagouedu.core.front.SystemManager;

import java.util.List;

/**
 * 获取系统管理
 * @author wukong 源码学院 Java互联网技术QQ群：940577921（备注：11）
 */
public class SystemManagerGetter implements TemplateMethodModelEx {
    @Override
    public Object exec(List arguments) throws TemplateModelException {
        return SystemManager.getInstance();
    }
}
