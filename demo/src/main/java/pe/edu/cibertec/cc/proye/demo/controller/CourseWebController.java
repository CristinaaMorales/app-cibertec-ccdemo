package pe.edu.cibertec.cc.proye.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.cibertec.cc.proye.demo.service.CourseService;

@Controller
public class CourseWebController {

    private final CourseService courseService;

    public CourseWebController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/courses")
    public String listarCourses(Model model) {
        model.addAttribute("courses", courseService.listarCourses());
        return "courses";
    }
}