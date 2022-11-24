package kodlama.io.devs.business.abstracts;

import kodlama.io.devs.business.requests.languages.CreateLanguageRequest;
import kodlama.io.devs.business.requests.languages.DeleteLanguageRequest;
import kodlama.io.devs.business.requests.languages.UpdateLanguageRequest;
import kodlama.io.devs.business.responses.languages.GetAllLanguagesResponse;

import java.util.List;

public interface LanguageService {
    List<GetAllLanguagesResponse> getAll();
    void add(CreateLanguageRequest createLanguageRequest);
    void update(UpdateLanguageRequest updateLanguageRequest);
    void delete(DeleteLanguageRequest deleteLanguageRequest);

}
