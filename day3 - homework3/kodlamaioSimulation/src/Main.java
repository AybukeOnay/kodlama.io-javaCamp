import business.concretes.CategoryManager;
import business.concretes.CourseManager;
import core.abstracts.Logger;
import core.concretes.DatabaseLogger;
import core.concretes.FileLogger;
import core.concretes.MailLogger;
import dataAccess.abstracts.CategoryDao;
import dataAccess.concretes.HibernateCategoryDao;
import dataAccess.concretes.JdbcCourseDao;
import entities.Category;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Category category = new Category(1,"Yazılım");
        Category category1 = new Category(2,"Eğitim");

        List<Category> categories = new ArrayList<>();
        categories.add(category);
        categories.add(category1);

        Course course = new Course(1,"Javascript",84);
        Course course1 = new Course(2,"C#",-80);

        List<Course> courses = new ArrayList<>();
        courses.add(course);
        courses.add(course1);

        List<Logger> loggers = new ArrayList<>();
        loggers.add(new DatabaseLogger());
        loggers.add(new FileLogger());

        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),categories,loggers);
        categoryManager.add(category);
        categoryManager.add(category1);

        System.out.println("------------------------------");

        CourseManager courseManager = new CourseManager(new JdbcCourseDao(),courses,loggers);
        courseManager.add(course);
        courseManager.add(course1);

    }
}