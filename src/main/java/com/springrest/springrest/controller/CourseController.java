package com.springrest.springrest.controller;

import com.springrest.springrest.entities.Courses;
import com.springrest.springrest.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
@Autowired
    private ICourseService courseService;

    @GetMapping("/courses")
    public List<Courses> getCourses() {
        return this.courseService.getCourses();
    }

    @GetMapping("/courses/{courseid}")
    public Courses getCourseByID(@PathVariable String courseid) {
        return this.courseService.getCourseByID(Long.parseLong(courseid));
    }

    @PostMapping("/courses")
    public List<Courses> getCourses(@RequestBody Courses courses) {
        return this.courseService.getCourses(courses);
    }

}
