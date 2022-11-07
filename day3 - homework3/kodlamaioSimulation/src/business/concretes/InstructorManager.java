package business.concretes;

import core.abstracts.Logger;
import dataAccess.abstracts.InstructorDao;
import entities.Instructor;

import java.util.List;

public class InstructorManager {
    private InstructorDao instructorDao;
    private List<Instructor> instructors;
    private List<Logger> loggers;

    public InstructorManager(InstructorDao instructorDao, List<Instructor> instructors, List<Logger> loggers) {
        this.instructorDao = instructorDao;
        this.instructors = instructors;
        this.loggers = loggers;
    }

    public void add(Instructor instructor){
        instructorDao.add(instructor);
    }


}
