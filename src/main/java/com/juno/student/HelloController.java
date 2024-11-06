package com.juno.student;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/hello")
public class HelloController {
    
    @GetMapping("/java")
    public String hello(@RequestParam(name = "id") int id, Model model) {

        Map<Integer, Student> map = new HashMap<>();
        map.put(1, new Student(1, "준민", 10));
        map.put(2, new Student(2, "주아", 11));

        Student student = map.get(id);

        model.addAttribute("id", student.getId());
        model.addAttribute("name", student.getName());
        model.addAttribute("age", student.getAge());

        return "hello";
    }
    
}
