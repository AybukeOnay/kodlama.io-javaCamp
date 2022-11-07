package dataAccess.concretes;

import dataAccess.abstracts.CategoryDao;
import entities.Category;

public class HibernateCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Hibernate ile kategori eklendi : " +category.getName());
    }

    @Override
    public void delete(Category category) {
        System.out.println("Hibernate ile kategori silindi : " +category.getName());
    }
}
