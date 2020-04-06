package ua.lviv.iot.spring.first.restapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Student {
    private String firsStudent;
    private String secondStudent;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    public Student(String firstStudent, String secondStudent) {
        super();
        // this.id=id;
        this.firsStudent = firstStudent;
        this.secondStudent = secondStudent;
    }

    public Student() {
    }

    public String getSecondStudent() {
        return secondStudent;
    }

    public void setSecondStudent(String secondStudent) {
        this.secondStudent = secondStudent;
    }

    public String getFirsStudent() {
        return firsStudent;
    }

    public void setFirsStudent(String firsStudent) {
        this.firsStudent = firsStudent;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}