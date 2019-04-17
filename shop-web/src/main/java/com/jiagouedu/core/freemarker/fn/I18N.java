package com.jiagouedu.core.freemarker.fn;

import freemarker.template.TemplateMethodModelEx;
import freemarker.template.TemplateModelException;
import com.jiagouedu.core.i18n.MessageLoader;

import java.util.List;

/**
 * 国际化配置
 * @author wukong 源码学院 Java互联网技术QQ群：940577921（备注：11）
 */
public class I18N implements TemplateMethodModelEx {
    @Override
    public Object exec(List arguments) throws TemplateModelException {
        return MessageLoader.instance().getMessage(arguments.get(0).toString());
    }

}
