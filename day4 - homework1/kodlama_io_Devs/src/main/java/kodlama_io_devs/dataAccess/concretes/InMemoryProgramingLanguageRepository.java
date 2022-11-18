package kodlama_io_devs.dataAccess.concretes;

import kodlama_io_devs.dataAccess.abstracts.ProgramingLanguageRepository;
import kodlama_io_devs.entities.concretes.ProgramingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class InMemoryProgramingLanguageRepository implements ProgramingLanguageRepository {
    List<ProgramingLanguage> programingLanguages;

    @Autowired
    public InMemoryProgramingLanguageRepository(List<ProgramingLanguage> programingLanguages) {
        this.programingLanguages = programingLanguages;
        programingLanguages.add(new ProgramingLanguage(1,"Java"));
        programingLanguages.add(new ProgramingLanguage(2,"C#"));
        programingLanguages.add(new ProgramingLanguage(3,"Python"));
    }

    @Override
    public void add(ProgramingLanguage programingLanguage) {

        programingLanguages.add(programingLanguage);
        System.out.println("Programing language added" + programingLanguage.getName());
    }

    @Override
    public void delete(int languageId) {
        programingLanguages.remove(languageId);
        System.out.println("Programming language deleted");
    }

    @Override
    public void update(int languagesId,ProgramingLanguage programingLanguage) {
        programingLanguages.set(languagesId,programingLanguage);
        System.out.println("Programing language updated" + programingLanguage.getName());
    }

    @Override
    public List<ProgramingLanguage> getAll() {

        return programingLanguages;
    }

    @Override
    public ProgramingLanguage getById(int id) {

        return programingLanguages.get(id);
    }
}
