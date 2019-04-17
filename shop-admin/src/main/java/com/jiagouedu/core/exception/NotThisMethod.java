package com.jiagouedu.core.exception;

/**
 * 不支持此操作异常
 * 
 * @author wukong 源码学院 Java互联网技术QQ群：940577921（备注：11）
 * 
 */
public class NotThisMethod extends RuntimeException {

	private static final long serialVersionUID = 1L;

	/**
	 * @param string
	 */
	public NotThisMethod(String arg0) {
		super(arg0);
	}

}
