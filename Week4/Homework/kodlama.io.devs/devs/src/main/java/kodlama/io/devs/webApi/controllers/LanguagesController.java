package kodlama.io.devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import kodlama.io.devs.business.abstracts.LanguageService;
import kodlama.io.devs.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
	
	private LanguageService languageService;
	
	@Autowired
	public LanguagesController(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	@GetMapping("/getall")
	public List<Language> getAll(){
		return languageService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Language language) throws Exception{
		languageService.add(language);
	}
	
	@DeleteMapping("/delete")
	public void delete(@PathVariable int id) throws Exception{
		languageService.delete(id);
	}
	
	@PutMapping("/update")
	public void update(@PathVariable int id, @RequestBody Language language) throws Exception{
		languageService.update(id, language);
	}
	
	@GetMapping("/getbyid")
	public Language getById(int id) throws Exception{
		return languageService.getById(id);
	}

}
