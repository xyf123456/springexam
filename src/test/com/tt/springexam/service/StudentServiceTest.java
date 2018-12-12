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

    @Autowired
    private CourseService courseService;
    /**
     * @ Description:仅将被维护方对象添加进维护方对象Set中
     * 保存维护方对象
     * 第一组数据（仅将被维护方对象添加进维护方对象Set中，对维护方对象的单独保存和删除）：
     * 由于操作对象是维护方，成功地在student、course以及中间表student_courses中分别添加了
     * 数据并成功进行了删除。若将删除对象换成被维护方，同样能够成功删除。
     * @params:
     * @return:void
     **/
    @Test
    public void add() throws Exception {

        Student s = new Student();
        s.setsName("学生1");
        Course c = new Course();
        c.setcName("语文");
        s.getCourses().add(c);
        studentService.add(s);
    }

    /**
     * @ Description:仅将维护方对象添加进被维护方对象Set中
     * 保存被维护方对象
     * 第二组数据（仅将维护方对象添加进被维护方对象Set中，对被维护方对象的单独保存和删除）：
     * 操作对象在这里换成了被维护方。不负众望，出问题了。保存的时候，student表和course表倒
     * 是都成功地插入了数据，但是中间表中，并未产生对两者数据的关联。因此，在删除的时候也只
     * 删除了course中的数据。
     * @params:  * @Param:
     * @return:void
     **/
    @Test
    public void add2() throws Exception {

        Student s = new Student();
        s.setsName("学生2");
        Course c = new Course();
        c.setcName("数学");
        c.getStudents().add(s);
        courseService.add(c);
    }

    /**
     * @ Description:第三组数据（ 将双方对象均添加进双方Set中，对被维护方对象进行保存和删除）：
     * 操作对象是被维护方，操作结果与第一组相同。
     * @params:  * @Param:
     * @return:void
     **/
    @Test
    public void add3() throws Exception {
        Student s = new Student();
        s.setsName("学生3");
        Course c = new Course();
        c.setcName("英语");
        s.getCourses().add(c);
        c.getStudents().add(s);
        courseService.add(c);
    }

    /**
     * @ Description: 删除维护方对象
     * 因此，在删除的时候也只删除了course中的数据。
     * @params:  * @Param:
     * @return:void
     **/
    @Test
    public void delStu() throws Exception {
        Student student=studentService.findByName("学生2");
        studentService.delete(student);
    }

    /**
     * @ Description: 删除被维护方对象
     * @params:  * @Param:
     * @return:void
     **/
    @Test
    public void delCourse() throws Exception {
        Course course=courseService.findByName("数学");
        courseService.delete(course);
    }



}