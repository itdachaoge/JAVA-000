package com.geek.spring.homework.auto_starter;

import com.geek.spring.homework.school_xml.Klass;
import com.geek.spring.homework.school_xml.School;
import com.geek.spring.homework.school_xml.Student;
import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.validation.Valid;

/**
 * @author: zhangycl
 * @date: 2020/11/17
 * @description:
 */
@Data
@ToString
@ConfigurationProperties("spring.school")
public class SchoolPorperties {


    private School schoollist;


}
