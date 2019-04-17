package com.jiagouedu.core.exception;

/**
 * 修改订单状态异常
 * 
 * @author wukong 源码学院 Java互联网技术QQ群：940577921（备注：11）
 * 
 */
public class UpdateOrderStatusException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	/**
	 * @param string
	 */
	public UpdateOrderStatusException(String arg0) {
		super(arg0);
	}

}
