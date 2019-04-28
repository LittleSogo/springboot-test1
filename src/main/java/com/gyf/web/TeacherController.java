package src.main.java.com.gyf.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Createed by  slix
 * 2019/4/27 23:10
 */
@EnableAutoConfiguration
@RequestMapping("teacher")
public class TeacherController {

    @RequestMapping("list")
    public String list(){
        return "teacher/list1";
    }

    public static void main(String[] args) {
        SpringApplication.run(TeacherController.class,args);
    }
}
