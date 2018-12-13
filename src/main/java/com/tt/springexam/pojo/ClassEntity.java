package com.tt.springexam.pojo;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName: com.tt.springexam.pojo.ClassEntity
 * @Description: 班级实体类
 * @Author: Administrator
 * @CreateDate: 2018/12/13 14:34
 * @UpdateUser: Administrator
 * @Version: 1.0
 *
 * CascadeType：给当前设置的实体操作另一个实体的权限。
    ALL:拥有所有权限；
    PERSIST: 级联保存权限  保存当前实体时，与它有映射关系的实体也会跟着被保存。
    MERGE: 级联更新（合并）操作。 更新当前实体时，与它有映射关系的实体也会跟着被更新。
    REMOVE: 级联删除操作。 删除当前实体时，与它有映射关系的实体也会跟着被删除。
    REFRESH: 级联刷新操作。 设场景 有一个订单,订单里面关联了许多商品,这个订单可以被很多人操作,那么这个时候A对此订单和关联的商品进行了修改,与此同时,B也进行了相同的操作,但是B先一步比A保存了数据,那么当A保存数据的时候,就需要先刷新订单信息及关联的商品信息后,再将订单及商品保存。
    DETACH: 级联脱管/游离操作。如果你要删除一个实体，但是它有外键无法删除，你就需要这个级联权限了。它会撤销所有相关的外键关联。
 **/
@Entity
public class ClassEntity {

    @Id
    @GeneratedValue(generator = "idGenerator")
    @GenericGenerator(name = "idGenerator", strategy = "uuid")
    private String id;

    private String cName;

    //    和学生的关系为一对多
//    1、一对多关系即数据库中的一行数据关联另一个数据库中的多行关系。多对一与之相反
//    2、一对多与多对一关系也可能会有中间表关联两者。但是我们一般不建议使用中间表。使用
//    mapperBy可以避免系统生成中间表（会在多的一方数据库中增加一个字段记录外键）。
//    3、这两个关系中的mappedBy一般声明于一的一方，即一的一方为被维护方。
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "classEntity")
    private Set<Student> students= new HashSet<>();

    public ClassEntity() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
