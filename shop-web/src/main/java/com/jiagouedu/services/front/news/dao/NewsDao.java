/**
 * 2012-7-8
 * jqsl2012@163.com
 */
package com.jiagouedu.services.front.news.dao;

import com.jiagouedu.core.DaoManager;
import com.jiagouedu.services.front.news.bean.News;

import java.util.List;


/**
 * @author wukong 源码学院 Java互联网技术QQ群：940577921（备注：11）
 * @param <T>
 */
public interface NewsDao extends DaoManager<News> {

	/**
	 * @param e
	 * @return
	 */
	List<News> selecIndexNews(News e);

	/**
	 * @return
	 */
	List<String> selectAllMd5();

	/**
	 * @param e
	 */
	void updateInBlackList(String e);

	/**
	 * @param news
	 */
	void sync(News news);

	List<News> selectNoticeList(News news);

	News selectSimpleOne(News news);

}
