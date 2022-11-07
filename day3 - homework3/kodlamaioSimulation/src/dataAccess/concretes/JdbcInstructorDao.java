package dataAccess.concretes;

import dataAccess.abstracts.InstructorDao;
import entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Jdbc ile eğitmen eklendi : " + instructor.getFirstName());
    }

    @Override
    public void delete(Instructor instructor) {
        System.out.println("Jdbc ile eğitmen silindi : " + instructor.getFirstName());
    }
}
