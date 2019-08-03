package com.testService;

//import com.testService.TestController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/***
* This is the javadoc example.
*/
@SpringBootApplication
@ComponentScan(basePackageClasses = { TestController.class })
@EnableAutoConfiguration
public class TestServiceApplication {
/***
* This is the javadoc example.
*/
    private String bar = new String("bar");
/***
* This is the javadoc example.
*/
    public static void main(String[] args) {
        SpringApplication.run(TestServiceApplication.class, args);
        System.exit(0);
    }

}
