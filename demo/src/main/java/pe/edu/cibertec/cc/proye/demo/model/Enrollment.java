package pe.edu.cibertec.cc.proye.demo.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "enrollment")
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int enrollment_id;
    @ManyToOne
    @JoinColumn(name ="student_id", nullable = false)
    private Student student;
    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;
    private LocalDate enroll_date;

    public int getEnrollment_id() {
        return enrollment_id;
    }

    public void setEnrollment_id(int enrollment_id) {
        this.enrollment_id = enrollment_id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public LocalDate getEnroll_date() {
        return enroll_date;
    }

    public void setEnroll_date(LocalDate enroll_date) {
        this.enroll_date = enroll_date;
    }
}
