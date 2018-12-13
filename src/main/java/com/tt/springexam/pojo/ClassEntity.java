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
