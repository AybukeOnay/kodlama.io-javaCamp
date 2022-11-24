package kodlama.io.devs.webApi.controller;

import kodlama.io.devs.business.abstracts.LanguageService;
import kodlama.io.devs.business.requests.languages.CreateLanguageRequest;
import kodlama.io.devs.business.requests.languages.DeleteLanguageRequest;
import kodlama.io.devs.business.requests.languages.UpdateLanguageRequest;
import kodlama.io.devs.business.responses.languages.GetAllLanguagesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
    private LanguageService languageService;

    @Autowired
    public LanguagesController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/getall")
    public List<GetAllLanguagesResponse> getAll(){
        return languageService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody CreateLanguageRequest createLanguageRequest){
        this.languageService.add(createLanguageRequest);
    }

    @PutMapping("/update")
    public void update(@RequestBody UpdateLanguageRequest updateLanguageRequest){
        this.languageService.update(updateLanguageRequest);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody DeleteLanguageRequest deleteLanguageRequest){
        this.languageService.delete(deleteLanguageRequest);
    }
}
