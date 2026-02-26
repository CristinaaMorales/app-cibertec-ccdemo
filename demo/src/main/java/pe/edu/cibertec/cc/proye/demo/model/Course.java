package pe.edu.cibertec.cc.proye.demo.model;

import jakarta.persistence.*;

@Table(name = "course")
@Entity

public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int course_id;
    private String course_name;
    private String certification;
    private String provider;
    private String level;
    private int duration_hours;

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getDuration_hours() {
        return duration_hours;
    }

    public void setDuration_hours(int duration_hours) {
        this.duration_hours = duration_hours;
    }
}
