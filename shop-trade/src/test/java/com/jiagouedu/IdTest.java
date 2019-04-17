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

import com.jiagouedu.core.front.keygenerator.RedisServiceImpl;
import com.jiagouedu.core.front.keygenerator.SnowflakeIdServiceImpl;
import com.jiagouedu.core.front.keygenerator.UUIDServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring/application-config.xml"})
public class IdTest {
   @Autowired
   private UUIDServiceImpl uuidService;
   @Autowired
   private SnowflakeIdServiceImpl snowflakeIdServer;

   @Autowired
   private RedisServiceImpl redisService;
   @Test
   public void getId(){
      BitUtil.timeTasks(100, 100, new Runnable() {
         @Override
         public void run() {
            System.out.println("insert into bit_table values('"+uuidService.generator()+"');");;
         }
      });

   }

   @Test
   public void getId2(){
      BitUtil.timeTasks(100, 100, new Runnable() {
         @Override
         public void run() {
            System.out.println("insert into bit_table values('"+snowflakeIdServer.generator()+"');");;
         }
      });

   }

   @Test
   public void getId3(){
      BitUtil.timeTasks(100, 100, new Runnable() {
         @Override
         public void run() {
            System.out.println("insert into bit_table values('"+redisService.generator()+"');");;
         }
      });

   }

}
