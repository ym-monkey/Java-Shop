package com.jiagouedu.core.front.keygenerator;/* ━━━━━━如来保佑━━━━━━
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

import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class UUIDServiceImpl implements KeyGenrators {
   @Override
   public String generator() {
      return UUID.randomUUID().toString();
   }
}
