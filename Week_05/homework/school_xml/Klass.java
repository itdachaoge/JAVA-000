package com.geek.spring.homework.school_xml;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class Klass { 
    
    List<Student> students;
    
    public void dong(){
        System.out.println(this.getStudents());
    }
    
}
