package com.tt.springexam.service;

import com.tt.springexam.pojo.Course;
import com.tt.springexam.pojo.Student;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
//由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
@WebAppConfiguration
public class StudentServiceTest {

    @Before
    public void init() {
        System.out.println("开始测试-----------------");
    }

    @After
    public void after() {
        System.out.println("测试结束-----------------");
    }

    @Autowired
    private StudentService studentService;

    @Test
    public void add() throws Exception {
        Student s = new Student();
        s.setsName("学生1");
        Course c = new Course();
        c.setcName("语文");
        s.getCourses().add(c);
        studentService.add(s);
    }

}