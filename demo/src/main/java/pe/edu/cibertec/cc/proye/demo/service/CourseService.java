package pe.edu.cibertec.cc.proye.demo.service;

import org.springframework.stereotype.Service;
import pe.edu.cibertec.cc.proye.demo.model.Course;
import pe.edu.cibertec.cc.proye.demo.repository.CourseRepository;

import java.util.List;

@Service
public class CourseService {
    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }
    public List<Course> listarCourses(){
        return courseRepository.findAll();
    }
}
