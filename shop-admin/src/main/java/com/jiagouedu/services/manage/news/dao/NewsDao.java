/**
 * 2012-7-8
 * jqsl2012@163.com
 */
package com.jiagouedu.services.manage.news.dao;

import com.jiagouedu.core.DaoManager;
import com.jiagouedu.services.manage.news.bean.News;

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
	 * @param news
	 */
	void sync(News news);

	void updateDownOrUp(News news);

	int selectCount(News news);

	List<News> selectNoticeList(News news);
}
