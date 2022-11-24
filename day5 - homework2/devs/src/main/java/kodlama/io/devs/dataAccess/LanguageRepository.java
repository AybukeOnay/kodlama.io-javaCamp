package kodlama.io.devs.dataAccess;

import kodlama.io.devs.entities.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository extends JpaRepository<Language,Integer> {
}
