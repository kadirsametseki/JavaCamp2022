package oopWithNLayeredApp2.dataAccess;

import oopWithNLayeredApp2.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile veritabanına eklendi : " + instructor.getId());
		
	}
	
}
