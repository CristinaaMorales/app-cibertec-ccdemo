package pe.edu.cibertec.cc.proye.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.cc.proye.demo.model.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
