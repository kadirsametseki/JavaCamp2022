package oopWithNLayeredApp2.dataAccess;

import oopWithNLayeredApp2.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Jdbc ile veritabanına eklendi : " + category.getId());
		
	}

}
