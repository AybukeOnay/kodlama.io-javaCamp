package kodlama_io_devs.business.concretes;

import kodlama_io_devs.business.abstracts.ProgramingLanguageService;
import kodlama_io_devs.dataAccess.concretes.InMemoryProgramingLanguageRepository;
import kodlama_io_devs.entities.concretes.ProgramingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramingLanguageManager implements ProgramingLanguageService {
    private InMemoryProgramingLanguageRepository inMemoryProgramingLanguageRepository;

    @Autowired
    public ProgramingLanguageManager(InMemoryProgramingLanguageRepository inMemoryProgramingLanguageRepository) {
        this.inMemoryProgramingLanguageRepository = inMemoryProgramingLanguageRepository;
    }

    @Override
    public void add(ProgramingLanguage programingLanguage) {
        checkIfLanguageNameIsExist(programingLanguage.getName());
        inMemoryProgramingLanguageRepository.add(programingLanguage);
    }

    @Override
    public void delete(int languageId) {
        inMemoryProgramingLanguageRepository.delete(languageId);
    }

    @Override
    public void update(int languageId,ProgramingLanguage programingLanguage) {
        checkIfLanguageNameIsExist(programingLanguage.getName());
        inMemoryProgramingLanguageRepository.update(languageId,programingLanguage);
    }

    @Override
    public List<ProgramingLanguage> getAll() {
        return inMemoryProgramingLanguageRepository.getAll();
    }


    public ProgramingLanguage getById(int languageId) {
        return inMemoryProgramingLanguageRepository.getById(languageId);
        }

    private boolean checkIfLanguageNameIsExist(String name){
        boolean existName = false;
        for (ProgramingLanguage programingLanguage : inMemoryProgramingLanguageRepository.getAll()){
            if (name == programingLanguage.getName()){
                System.out.println("Program language name is already use");
                existName = true;
            }
        }
        return existName;
    }

}
