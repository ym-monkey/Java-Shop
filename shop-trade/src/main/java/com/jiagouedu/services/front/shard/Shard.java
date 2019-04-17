package com.jiagouedu.services.front.shard;/* ━━━━━━如来保佑━━━━━━
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

import java.util.List;

public class Shard {
   private Integer id;
   private String name;
   private Integer groupid;
   private Integer hashValue;
   private List<LogicTable> logicTableList;

   public List<LogicTable> getLogicTableList() {
      return logicTableList;
   }

   public void setLogicTableList(List<LogicTable> logicTableList) {
      this.logicTableList = logicTableList;
   }

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Integer getGroupid() {
      return groupid;
   }

   public void setGroupid(Integer groupid) {
      this.groupid = groupid;
   }

   public Integer getHashValue() {
      return hashValue;
   }

   public void setHashValue(Integer hashValue) {
      this.hashValue = hashValue;
   }

   @Override
   public String toString() {
      return "Shard{" +
              "id=" + id +
              ", name='" + name + '\'' +
              ", groupid=" + groupid +
              ", hashValue=" + hashValue +
              ", logicTableList=" + logicTableList +
              '}';
   }
}
