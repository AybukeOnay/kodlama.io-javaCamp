package business.concretes;

import core.abstracts.Logger;
import dataAccess.abstracts.CourseDao;
import entities.Category;
import entities.Course;

import java.util.List;

public class CourseManager {
    private CourseDao courseDao;
    private List<Course> courses;
    private List<Logger> loggers;

    public CourseManager(CourseDao courseDao, List<Course> courses, List<Logger> loggers) {
        this.courseDao = courseDao;
        this.courses = courses;
        this.loggers = loggers;
    }

    public void add(Course course){
        checkIfCourseNameIsExist(course.getName());
        checkIfPriceIsValid(course.getPrice());
        courseDao.add(course);
        for (Logger logger : loggers){
            logger.log(course.getName());
        }
    }

    private boolean checkIfCourseNameIsExist(String name){
        boolean existName = false;
        for (Course course : courses){
            if(course.getName() == name){
                System.out.println("Bu kurs sistemde bulunmaktadır");
                existName = true;
            }
        }
        return  existName;
    }

    private void checkIfPriceIsValid(double coursePrice){
        if(coursePrice < 0) {
            System.out.println("Kurs fiyatı 0'dan küçük olamaz");
        }
    }
}
