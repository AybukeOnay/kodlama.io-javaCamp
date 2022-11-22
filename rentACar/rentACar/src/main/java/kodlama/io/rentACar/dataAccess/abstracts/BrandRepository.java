package kodlama.io.rentACar.dataAccess.abstracts;

import kodlama.io.rentACar.entites.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BrandRepository extends JpaRepository<Brand,Integer> {

}
