package com.codeclan.lab.courseBooking.repositories.CourseRepository;

import com.codeclan.lab.courseBooking.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.xml.crypto.Data;
import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {
    List<Course> getCoursesWithRating(int rating);
}
