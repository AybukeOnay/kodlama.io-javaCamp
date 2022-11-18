package kodlama_io_devs.webApi.controller;

import kodlama_io_devs.business.abstracts.ProgramingLanguageService;
import kodlama_io_devs.entities.concretes.ProgramingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programminglanguage")
public class ProgramingLanguagesController {
    private ProgramingLanguageService programingLanguageService;

    @Autowired
    public ProgramingLanguagesController(ProgramingLanguageService programingLanguageService) {
        this.programingLanguageService = programingLanguageService;
    }

    @GetMapping("/getall")
    public List<ProgramingLanguage> getAll(){
       return programingLanguageService.getAll();
    }

    @PostMapping("/add")
    public void add(ProgramingLanguage programingLanguage){
        programingLanguageService.add(programingLanguage);
    }

    @PutMapping("/update")
    public void update(int languageId,ProgramingLanguage programingLanguage){
        programingLanguageService.update(languageId,programingLanguage);
    }

    @PostMapping("/delete")
    public void delete(int languageId){
        programingLanguageService.delete(languageId);
    }

    @GetMapping("/getbyid")
    public ProgramingLanguage getById(int languageId){
        return programingLanguageService.getById(languageId);
    }
}
