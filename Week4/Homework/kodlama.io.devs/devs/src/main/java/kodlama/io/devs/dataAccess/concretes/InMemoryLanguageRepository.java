package kodlama.io.devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devs.entities.concretes.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

	List<Language> languages;

	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();
		languages.add(new Language(1, "C#"));
		languages.add(new Language(2, "Java"));
		languages.add(new Language(3, "Python"));
	}

	@Override
	public List<Language> getAll() {

		return languages;
	}

	@Override
	public void add(Language language) {
		languages.add(language);

	}

	@Override
	public void delete(int id) {
		languages.removeIf(l -> l.getId() == id);
	}

	@Override
	public void update(int id, Language language) {
		Language existingLanguage = languages.stream().filter(l->l.getId()==id).findFirst().orElseThrow();
		existingLanguage.setName(language.getName());
	}

	@Override
	public Language getById(int id) {
		return languages.stream().filter(l->l.getId()==id).findFirst().orElseThrow();
	}

}
