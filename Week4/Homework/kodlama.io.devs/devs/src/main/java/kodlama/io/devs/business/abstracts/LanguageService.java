package kodlama.io.devs.business.abstracts;

import java.util.List;

import kodlama.io.devs.entities.concretes.Language;

public interface LanguageService {
	
	List<Language> getAll();
	void add(Language language) throws Exception;
	void delete(int id) throws Exception;
	void update(int id, Language language) throws Exception;
	Language getById(int id) throws Exception;
	
}
