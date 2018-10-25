package com.codeclan.lab.courseBooking.repositories.CourseRepository;

import com.codeclan.lab.courseBooking.models.Course;

import java.util.List;

public interface CourseRepositoryCustom {
    List<Course> getCoursesWithRating(int rating);
}
