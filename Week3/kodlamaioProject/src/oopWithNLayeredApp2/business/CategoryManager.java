package oopWithNLayeredApp2.business;

import java.util.List;

import oopWithNLayeredApp2.core.logging.Logger;
import oopWithNLayeredApp2.dataAccess.CategoryDao;
import oopWithNLayeredApp2.entities.Category;

public class CategoryManager {
	
	private CategoryDao categoryDao;
	private List<Logger> loggers;
	private List<Category> categories;
	
	public CategoryManager(CategoryDao categoryDao, List<Logger> loggers, List<Category> categories) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;
	}
	
	public void add(Category category) throws Exception{
		for (Category c : categories) {
			if(c.getCategoryName().equals(category.getCategoryName())) {
				throw new Exception("Kategori isimleri aynı olamaz.");
			}
				
			categoryDao.add(category);
			
			for (Logger logger : loggers) {
				logger.log(category.getCategoryName());
			}
			
		}
	}
	
}
