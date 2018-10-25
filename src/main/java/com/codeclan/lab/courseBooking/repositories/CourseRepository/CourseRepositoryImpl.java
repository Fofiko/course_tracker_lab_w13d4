package com.codeclan.lab.courseBooking.repositories.CourseRepository;


import com.codeclan.lab.courseBooking.models.Course;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CourseRepositoryImpl implements CourseRepositoryCustom{

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Course> getCoursesWithRating(int rating) {
        List<Course> results = null;

        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Course.class);
            cr.add(Restrictions.eq("rating", rating));
            results = cr.list();
        }
        catch (HibernateException ex) {
            ex.printStackTrace();
        }
        finally {
            session.close();
        }
        return results;
    }
}
