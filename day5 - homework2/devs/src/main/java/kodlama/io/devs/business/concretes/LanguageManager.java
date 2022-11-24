package kodlama.io.devs.business.concretes;

import kodlama.io.devs.business.abstracts.LanguageService;
import kodlama.io.devs.business.requests.languages.CreateLanguageRequest;
import kodlama.io.devs.business.requests.languages.DeleteLanguageRequest;
import kodlama.io.devs.business.requests.languages.UpdateLanguageRequest;
import kodlama.io.devs.business.responses.languages.GetAllLanguagesResponse;
import kodlama.io.devs.dataAccess.LanguageRepository;
import kodlama.io.devs.entities.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LanguageManager implements LanguageService {
    private LanguageRepository languageRepository;

    @Autowired
    public LanguageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<GetAllLanguagesResponse> getAll() {
        List<Language> languages = languageRepository.findAll();
        List<GetAllLanguagesResponse> languagesResponse = new ArrayList<>();

        for (Language language : languages){
            GetAllLanguagesResponse responseItem = new GetAllLanguagesResponse();
            responseItem.setId(language.getId());
            responseItem.setName(language.getName());

            languagesResponse.add(responseItem);
        }
        return languagesResponse;
    }

    @Override
    public void add(CreateLanguageRequest createLanguageRequest) {
        Language language = new Language();
        language.setName(createLanguageRequest.getName());

        this.languageRepository.save(language);
        System.out.println("LANGUAGE.ADDED");

    }

    @Override
    public void update(UpdateLanguageRequest updateLanguageRequest) {
        Language language = new Language();
        language.setId(updateLanguageRequest.getId());
        language.setName(updateLanguageRequest.getName());

        this.languageRepository.save(language);
        System.out.println("LANGUAGE.UPDATED");
    }

    @Override
    public void delete(DeleteLanguageRequest deleteLanguageRequest) {
        this.languageRepository.deleteById(deleteLanguageRequest.getId());
        System.out.println("LANGUAGE.DELETED");
    }
}
