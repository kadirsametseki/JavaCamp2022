package kodlama.io.devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.devs.business.abstracts.LanguageService;
import kodlama.io.devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {

	private LanguageRepository languageRepository;

	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public List<Language> getAll() {
		return languageRepository.getAll();
	}

	@Override
	public void add(Language language) throws Exception {

		if (isIdExist(language.getId())) {
			throw new Exception("id zaten mevcut!");
		}
		if (isNameValid(language.getName())) {
			throw new Exception("İsim zaten mevcut!");
		}
		languageRepository.add(language);
	}

	@Override
	public void delete(int id) throws Exception {

		if (!isIdExist(id)) {
			throw new Exception("Id silindi!");
		}
		languageRepository.delete(id);
	}

	@Override
	public void update(int id, Language language) throws Exception {
		if (!isIdExist(language.getId())) {
			throw new Exception("Id bulunamadı!");
		}
		if (isNameValid(language.getName())) {
			throw new Exception("İsim tekrar edemez!");
		}
		languageRepository.update(id, language);
	}

	@Override
	public Language getById(int id) throws Exception {
		if (!isIdExist(id)) {
			throw new Exception("Id bulunamadı!");
		}
		return languageRepository.getById(id);
	}

	private boolean isNameValid(String name) throws Exception {
		
		return languageRepository.getAll().stream().anyMatch(l -> l.getName() == name);
	}

	private boolean isIdExist(int id) {
		return languageRepository.getAll().stream().anyMatch(l -> l.getId() == id);
	}

}
