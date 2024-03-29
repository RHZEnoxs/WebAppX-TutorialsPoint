package com.enoxs.form;

import com.enoxs.exception.SpringException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
    @RequestMapping(value = "/WebHome/student", method = RequestMethod.GET)
    public ModelAndView student() {
        return new ModelAndView("student", "command", new Student());
    }
    @RequestMapping(value = "/WebHome/addStudent", method = RequestMethod.POST)
    @ExceptionHandler({SpringException.class})
    public String addStudent(@ModelAttribute("WebHome")Student student,
                             ModelMap model) {
        /*model.addAttribute("name", student.getName());
        model.addAttribute("age", student.getAge());
        model.addAttribute("id", student.getId());*/

        if(student.getName().length() < 5 ){
            throw new SpringException("Given name is too short");
        } else {
            model.addAttribute("name", student.getName());
        }

        if( student.getAge() < 10 ){
            throw new SpringException("Given age is too low");
        } else {
            model.addAttribute("age", student.getAge());
        }
        model.addAttribute("id", student.getId());
        return "result";
    }
}
