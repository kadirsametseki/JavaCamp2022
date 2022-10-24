package oopWithNLayeredApp2;

import java.util.ArrayList;
import java.util.List;

import oopWithNLayeredApp2.business.CategoryManager;
import oopWithNLayeredApp2.business.CourseManager;
import oopWithNLayeredApp2.business.InstructorManager;
import oopWithNLayeredApp2.core.logging.DatabaseLogger;
import oopWithNLayeredApp2.core.logging.FileLogger;
import oopWithNLayeredApp2.core.logging.Logger;
import oopWithNLayeredApp2.core.logging.MailLogger;
import oopWithNLayeredApp2.dataAccess.HibernateCourseDao;
import oopWithNLayeredApp2.dataAccess.HibernateInstructorDao;
import oopWithNLayeredApp2.dataAccess.JdbcCategoryDao;
import oopWithNLayeredApp2.entities.Category;
import oopWithNLayeredApp2.entities.Course;
import oopWithNLayeredApp2.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Course course1 = new Course(1, "Java", 215);
		Course course2 = new Course(2, "Python", 160);

		List<Logger> loggers = new ArrayList<Logger>();
		loggers.add(new DatabaseLogger());
		loggers.add(new FileLogger());
		loggers.add(new MailLogger());

		List<Course> courses = new ArrayList<Course>();
		//courses.add(course1);

		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers, courses);
		//courseManager.add(course1);
		courseManager.add(course2);

		System.out.println("----------------------------------");

		Category category1 = new Category(1, "Veritabanı");
		Category category2 = new Category(2, "Siber Güvenlik");

		List<Category> categories = new ArrayList<Category>();
		categories.add(category1);

		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers, categories);
		//categoryManager.add(category1);
		categoryManager.add(category2);
		
		System.out.println("----------------------------------");
		
		Instructor instructor1 = new Instructor(1, "Engin", "Demiroğ");
		
		List<Instructor> instructors = new ArrayList<Instructor>();
		//instructors.add(instructor1);
		
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers, instructors);
		instructorManager.add(instructor1);
	}
}
