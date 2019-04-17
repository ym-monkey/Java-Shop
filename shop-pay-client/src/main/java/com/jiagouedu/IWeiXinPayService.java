package com.jiagouedu;/* ━━━━━━如来保佑━━━━━━
 * 　　　┏┓　　　┏┓
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　┃
 * 　　┃　　　┻　　　┃
 * 　　┗━┓　　　┏━┛
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┗┻┛　┗┻┛
 * ━━━━━━永无BUG━━━━━━
 * 源码学院-只为培养BAT程序员而生
 * 以往视频加可可老师QQ：793900009
 * http://bat.ke.qq.com
 */

import com.jiagouedu.model.Product;

public interface IWeiXinPayService {

   /**
    * 微信二维码支付
    * @Author  Monkey老师
    */
   String weixinPay(Product product);
}
