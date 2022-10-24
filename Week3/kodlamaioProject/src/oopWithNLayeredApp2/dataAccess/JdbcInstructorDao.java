package oopWithNLayeredApp2.dataAccess;

import oopWithNLayeredApp2.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Jdbc ile veritabanına eklendi : " + instructor.getId());
		
	}

}
