package com.example.demo.data;

import com.example.demo.entites.Topic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by eugene on 12/5/17.
 */
@Repository
public interface CourseRepository extends CrudRepository<Course, String> {

}
