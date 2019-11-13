package io.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class CourseApi {

    public static  void main(String[] args){
        SpringApplication.run(CourseApi.class, args);
    }
}
