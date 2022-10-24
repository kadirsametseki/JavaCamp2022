package oopWithNLayeredApp2.business;

import java.util.List;

import oopWithNLayeredApp2.core.logging.Logger;
import oopWithNLayeredApp2.dataAccess.CourseDao;
import oopWithNLayeredApp2.entities.Course;

public class CourseManager {
	
	private CourseDao courceDao;
	private List<Logger> loggers;
	private List<Course> courses;
	
	public CourseManager(CourseDao courceDao, List<Logger> loggers,List<Course>courses) {
		this.courceDao = courceDao;
		this.loggers = loggers;	
		this.courses = courses;
	}	
	
	public void add(Course course) throws Exception {
		
		for (Course c : courses) {
			if(c.getName().equals(course.getName())) {
				throw new Exception("Kurs isimleri aynı olamaz.");
			}
		}
		
		if(course.getPrice()<0) {
			throw new Exception("Kurs fiyatı 0'dan küçük olamaz.");
		}
			
		courceDao.add(course);
		
		for (Logger logger : loggers) {
			logger.log(course.getName());
		}
	}
}
