public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        Product product1 = new Product(2,"Bilgisayar","Asus laptop",15799,3);
        System.out.println(product1.getKod());
    }
}