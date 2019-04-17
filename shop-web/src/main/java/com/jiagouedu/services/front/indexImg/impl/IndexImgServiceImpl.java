/**
 * 2012-7-8
 * jqsl2012@163.com
 */
package com.jiagouedu.services.front.indexImg.impl;

import com.jiagouedu.core.ServersManager;
import com.jiagouedu.services.front.indexImg.IndexImgService;
import com.jiagouedu.services.front.indexImg.bean.IndexImg;
import com.jiagouedu.services.front.indexImg.dao.IndexImgDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * @author wukong 源码学院 Java互联网技术QQ群：940577921（备注：11）
 */
@Service("indexImgServiceFront")
public class IndexImgServiceImpl extends ServersManager<IndexImg, IndexImgDao> implements
		IndexImgService {

    @Resource(name = "indexImgDaoFront")
    @Override
    public void setDao(IndexImgDao indexImgDao) {
        this.dao = indexImgDao;
    }

	@Override
	public List<IndexImg> getImgsShowToIndex(int i) {
		return dao.getImgsShowToIndex(i);
	}

}
