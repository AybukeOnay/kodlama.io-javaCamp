public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        product.setId(1);
        product.setName("Laptop");
        product.setDescription("Dell Laptop");
        product.setPrice(15000);
        product.setStockAmount(5);
        System.out.println(product.getKod());
    }
}