package dataAccess.concretes;

import dataAccess.abstracts.InstructorDao;
import entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Hibernate ile eğitmen eklendi :" + instructor.getFirstName());
    }

    @Override
    public void delete(Instructor instructor) {
        System.out.println("Hibernate ile eğitmen silindi :" + instructor.getFirstName());

    }
}
