package kodlama.io.devs.dataAccess;

import kodlama.io.devs.entities.Technology;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnologyRepository extends JpaRepository<Technology,Integer> {
}
