package oopWithNLayeredApp2.business;

import java.util.List;

import oopWithNLayeredApp2.core.logging.Logger;
import oopWithNLayeredApp2.dataAccess.InstructorDao;
import oopWithNLayeredApp2.entities.Instructor;

public class InstructorManager {
	private InstructorDao instructorDao;
	private List<Logger> loggers;
	private List<Instructor> instructors;
	
	public InstructorManager(InstructorDao instructorDao, List<Logger> loggers, List<Instructor> instructors) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
		this.instructors = instructors;
	}
	
	public void add(Instructor instructor) throws Exception {
		for (Instructor i : instructors) {
			if(i.getFirstName().toUpperCase().equals(instructor.getFirstName().toUpperCase()) &&
					i.getLastName().toUpperCase().equals(instructor.getLastName().toUpperCase())) {
				throw new Exception("Eğitmen isimleri aynı olamaz.");
			}
		}
		
		
		instructorDao.add(instructor);
		
		for (Logger logger : loggers) {
			logger.log(instructor.getFirstName() + " " + instructor.getLastName());
		}
	}
}
