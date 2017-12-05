package com.example.demo.services;

import com.example.demo.data.CourseRepository;
import com.example.demo.data.TopicRepository;
import com.example.demo.entites.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by eugene on 12/1/17.
 */
@Service
public class CourseService {
    @Autowired
    private TopicRepository courseRepository;

    private List<Course> courses = new ArrayList<>(Arrays.asList(new Course("1", "b", "c")));

    public List<Course> getAllCourses(String id) {
        // return courses;
//        return (List<Course>) courseRepository.findAll();
        return courseRepository.findAll()

    }

    public Course getCourseById(String id) {
        return courseRepository.findOne(id);
        // return courses.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addCourse(Course course) {
        //  courses.add(course);
        courseRepository.save(course);
    }

    public void updateCourseById(String id, Course course) {
//        for (int i = 0; i < courses.size(); i++) {
//            Course temp = courses.get(i);
//            if (temp.getId().equals(id)) {
//                courses.set(i, course);
//                return;
//            }
//        }
        courseRepository.save(course);
    }

    public void deleteCourseById(String id) {
        courseRepository.delete(id);
     //   courses.removeIf(t -> t.getId().equals(id));
    }

}
