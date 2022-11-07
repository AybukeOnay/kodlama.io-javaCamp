package dataAccess.concretes;

import dataAccess.abstracts.CourseDao;
import entities.Course;

public class JdbcCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Jdbc ile kurs eklendi : " +course.getName());
    }

    @Override
    public void delete(Course course) {
        System.out.println("Jdbc ile kurs silindi : " +course.getName());
    }
}
