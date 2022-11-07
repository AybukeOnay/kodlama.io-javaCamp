package dataAccess.concretes;

import dataAccess.abstracts.CategoryDao;
import entities.Category;

public class JdbcCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Jdbc ile kategori eklendi : " +category.getName());
    }

    @Override
    public void delete(Category category) {
        System.out.println("Jdbc ile kategori silindi : " +category.getName());
    }
}
