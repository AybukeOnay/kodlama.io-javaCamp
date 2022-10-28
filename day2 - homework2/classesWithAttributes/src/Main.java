public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        product.id = 1;
        product.name = "Laptop";
        product.description = "Ürün açıklaması";
        product.price = 15000;
        product.stockAmount = 6;

        ProductManager productManager = new ProductManager();
        productManager.add(product);

    }
}