package com.geek.spring.homework.school_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: zhangycl
 * @date: 2020/11/16
 * @description: 一个学校有一个年级，年级里有两个学生
 */
public class Main {
    public static void main(String[] args) {
        //1.获取核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("school_xml.xml");
//        ApplicationContext ac = new FileSystemXmlApplicationContext("C:\\Users\\zhangycl\\Desktop\\spring_bean.xml");
        //2.根据id获取Bean对象
        ISchool iSchool = ac.getBean("school",ISchool.class);

        System.out.println(iSchool);   //School(klasses=[Klass(students=[Student(id=1, name=zhangycl), Student(id=2, name=zhangycl2)])])
        iSchool.ding(); //Class1 have 1
                        //[Klass(students=[Student(id=1, name=zhangycl), Student(id=2, name=zhangycl2)])]
    }
}
