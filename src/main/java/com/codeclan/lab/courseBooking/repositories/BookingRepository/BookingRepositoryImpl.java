package com.codeclan.lab.courseBooking.repositories.BookingRepository;

import com.codeclan.lab.courseBooking.models.Booking;
import com.codeclan.lab.courseBooking.models.Course;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class BookingRepositoryImpl implements BookingRepositoryCustom{

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Booking> getBookingsForDate(String date) {
        List<Booking> results = null;

        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Booking.class);
            cr.add(Restrictions.eq("date", date));
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
