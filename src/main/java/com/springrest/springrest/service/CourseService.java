package com.springrest.springrest.service;

import com.springrest.springrest.entities.Courses;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class CourseService implements ICourseService {

    List<Courses> listCourses;

    public CourseService() {
        listCourses = new ArrayList<>();
        listCourses.add(new Courses(123,
                "REACT JS COURSE",
                "React Js Course for beginners"));
        listCourses.add(new Courses(456,
                "JAVA COURSE",
                "JAVA Course for beginners"));
    }

    @Override
    public List<Courses> getCourses() {
        return listCourses;
    }

    @Override
    public Courses getCourseByID(long courseid) {
        Courses course = null;
        for (Courses c:
             listCourses) {
            if(c.getId()==courseid) {
                course=c;
                break;
            }
            
        }
        return course;
    }

    @Override
    public List<Courses> getCourses(Courses courses) {
        listCourses.add(new Courses(courses.getId(),
                courses.getTitle(),
                courses.getDescription()));
        return listCourses;
    }


}
