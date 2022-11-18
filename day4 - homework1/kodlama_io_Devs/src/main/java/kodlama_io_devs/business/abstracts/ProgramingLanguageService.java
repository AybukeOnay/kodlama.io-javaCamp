package kodlama_io_devs.business.abstracts;

import kodlama_io_devs.entities.concretes.ProgramingLanguage;

import java.util.List;

public interface ProgramingLanguageService {
    void add(ProgramingLanguage programingLanguage);
    void delete(int languageId);
    void update(int languageId,ProgramingLanguage programingLanguage);
    List<ProgramingLanguage> getAll();
    ProgramingLanguage getById(int languageId);
}
