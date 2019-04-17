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

public class ShardGroup {
   private Integer id;
   private String name;
   private boolean writable;
   private long startid;
   private long endid;

   private List<Shard> shards;

   public List<Shard> getShards() {
      return shards;
   }

   public void setShards(List<Shard> shards) {
      this.shards = shards;
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

   public boolean isWritable() {
      return writable;
   }

   public void setWritable(boolean writable) {
      this.writable = writable;
   }

   public long getStartid() {
      return startid;
   }

   public void setStartid(long startid) {
      this.startid = startid;
   }

   public long getEndid() {
      return endid;
   }

   public void setEndid(long endid) {
      this.endid = endid;
   }

   @Override
   public String toString() {
      return "ShardGroup{" +
              "id=" + id +
              ", name='" + name + '\'' +
              ", writable=" + writable +
              ", startid=" + startid +
              ", endid=" + endid +
              ", shards=" + shards +
              '}';
   }
}
