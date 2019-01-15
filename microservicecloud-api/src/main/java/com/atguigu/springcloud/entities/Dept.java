package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

//@AllArgsConstructor  //全参构造函数
@Data  //提供类所有属性的 getting 和 setting 方法，此外还提供了equals、canEqual、hashCode、toString 方法
@NoArgsConstructor   //空参构造函数
@Accessors(chain = true)  //链式风格法
public class Dept implements Serializable {//Dept(entity)  orm  mysql-> Dept(table) 类表关系映射
    private Long  deptno;   //主键
    private String  dname;   //部门名称
    private String  db_source;//这个说明连接自己的数据库(微服务里)    来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

    public Dept(String dname) {
        super();
        this.dname = dname;
    }

//    public static void main(String[] args) {
//        Dept dept = new Dept();
//        dept.setDb_source("asdf").setDeptno(12l).setDname("fsdaf");// @Accessors(chain = true)  //链式风格法
//        System.out.println(dept);
//    }
}
