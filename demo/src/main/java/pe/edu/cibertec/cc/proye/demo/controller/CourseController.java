package pe.edu.cibertec.cc.proye.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.cc.proye.demo.model.Course;
import pe.edu.cibertec.cc.proye.demo.service.CourseService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/courses")
public class CourseController {
    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    //localhost
    @GetMapping
    public ResponseEntity<List<Course>> listarCourses(){
        return ResponseEntity.ok(courseService.listarCourses());
    }
}
