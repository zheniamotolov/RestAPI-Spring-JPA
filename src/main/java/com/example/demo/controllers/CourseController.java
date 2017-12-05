package com.example.demo.controllers;

import com.example.demo.entites.Topic;
import com.example.demo.services.CourseService;
import com.example.demo.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by eugene on 12/1/17.
 */
@RestController
public class CourseController {
    @Autowired
    private CourseService course;

    @GetMapping("/topics/{id}/courses")
    public List<Topic> getAllCourses(@PathVariable("id") String id) {
        return course.getAllCourses(id);
    }

    @GetMapping("/topics/{topicId}/courses/{id}")
    public Course getCourseById(@PathVariable("id") String id) {
        return course.getCourseById(id);
    }

    @PostMapping("/topics/{topicId}/courses/{id}")
    public void addCourse(@RequestBody Course course) {
        course.addCourse(course);
    }
    @PutMapping("/courses/{id}")
    public void updateCourseById(@RequestBody Course course,@PathVariable("id") String id) {
        course.updateCourseById(id,course);
    }
    @DeleteMapping("/courses/{id}")
    public void deleteCourseById(@PathVariable("id") String id) {
        course.deleteCourseById(id);
    }
}
