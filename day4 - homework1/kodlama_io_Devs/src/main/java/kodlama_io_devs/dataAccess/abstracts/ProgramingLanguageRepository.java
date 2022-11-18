package kodlama_io_devs.dataAccess.abstracts;

import kodlama_io_devs.entities.concretes.ProgramingLanguage;

import java.util.List;

public interface ProgramingLanguageRepository {
    void add(ProgramingLanguage programingLanguage);
    void delete(int languageId);
    void update(int languagesId,ProgramingLanguage programingLanguage);
    List<ProgramingLanguage> getAll();
    ProgramingLanguage getById(int id);
}
