package business.concretes;

import core.abstracts.Logger;
import dataAccess.abstracts.CategoryDao;
import entities.Category;

import java.util.List;

public class CategoryManager {
    private CategoryDao categoryDao;
    private List<Category> categories;
    private List<Logger> loggers;

    public CategoryManager(CategoryDao categoryDao, List<Category> categories, List<Logger> loggers) {
        this.categoryDao = categoryDao;
        this.categories = categories;
        this.loggers = loggers;
    }

    public void add(Category category){
        checkIfCategoryNameIsExist(category.getName());
        categoryDao.add(category);
        for (Logger logger : loggers){
            logger.log(category.getName());
        }
    }

    private boolean checkIfCategoryNameIsExist(String name){
        boolean existName = false;
        for (Category categories : categories){
            if(categories.getName() == name){
                System.out.println("Bu kategori sistemde bulunmaktadır.");
                existName = true;
            }
        }
        return  existName;
    }
}
