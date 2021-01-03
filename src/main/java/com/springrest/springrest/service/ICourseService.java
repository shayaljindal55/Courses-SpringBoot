package com.springrest.springrest.service;

import com.springrest.springrest.entities.Courses;

import java.util.List;

public interface ICourseService {
    public List<Courses> getCourses();
    public  Courses getCourseByID(long courseid);
    public List<Courses> getCourses(Courses courses);
}
