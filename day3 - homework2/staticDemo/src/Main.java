public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        product.id=1;
        product.name="Klavye";
        product.price=500;

        ProductManager productManager = new ProductManager();
        productManager.add(product);

        DatabaseHelper.Connection.createConnection();
    }
}