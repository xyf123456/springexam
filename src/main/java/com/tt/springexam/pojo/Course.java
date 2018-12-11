package com.tt.springexam.pojo;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * 课程实体类
 */
@Entity
public class Course {
    @Id
    @GeneratedValue(generator = "idGenerator")
    @GenericGenerator(name = "idGenerator", strategy = "uuid")
    private String id;
    private String cName;

   /* mappedBy声明于关系的被维护方，声明的值为关系的维护方的关系对象属性名。
    在实例中，mappedBy被声明于Course类中，其值为Student类中的Set对象"courses"。
    即，Student为关系维护方，Course为被维护方。*/
    @ManyToMany(cascade= CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="courses")
    private Set<Student> students= new HashSet<>();

    public Course() {
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
