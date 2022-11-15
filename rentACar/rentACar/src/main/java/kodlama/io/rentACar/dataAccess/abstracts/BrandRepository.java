package kodlama.io.rentACar.dataAccess.abstracts;

import kodlama.io.rentACar.entites.concretes.Brand;
import java.util.List;

public interface BrandRepository {
    List<Brand> getAll();
}
