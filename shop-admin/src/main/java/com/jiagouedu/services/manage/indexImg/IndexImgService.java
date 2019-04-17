/**
 * 2012-7-8
 * jqsl2012@163.com
 */
package com.jiagouedu.services.manage.indexImg;

import com.jiagouedu.core.Services;
import com.jiagouedu.services.manage.indexImg.bean.IndexImg;

import java.util.List;


/**
 * @author wukong 源码学院 Java互联网技术QQ群：940577921（备注：11）
 */
public interface IndexImgService extends Services<IndexImg> {

	/**
	 * 加载图片显示到门户
	 * @param i
	 */
	List<IndexImg> getImgsShowToIndex(int i);

}
