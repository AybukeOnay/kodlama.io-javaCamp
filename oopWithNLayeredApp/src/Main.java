import business.ProductManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.HibernateProductDao;
import dataAccess.JdbcProductDao;
import entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {

        Product product = new Product(1,"Iphone 14",40000);

        Logger[] loggers = {new DatabaseLogger(),new FileLogger()};

        ProductManager productManager = new ProductManager(new JdbcProductDao(),loggers);
        productManager.add(product);

        //HibernateProductDao hibernateProductDao = new HibernateProductDao();
        //hibernateProductDao.add(product);
    }
}