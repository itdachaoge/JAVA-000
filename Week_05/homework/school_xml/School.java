package com.geek.spring.homework.school_xml;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Data
@ToString
public class School implements ISchool {


    List<Klass> klasses;

    @Override
    public void ding(){
    
        System.out.println("Class1 have " + this.klasses.size());
        System.out.println(klasses.toString());
        
    }
    
}
