package dataAccess.concretes;

import dataAccess.abstracts.CourseDao;
import entities.Course;

public class HibernateCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Hibernate ile kurs eklendi : " + course.getName());
    }

    @Override
    public void delete(Course course) {
        System.out.println("Hibernate ile kurs silindi : " + course.getName());
    }
}
