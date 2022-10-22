public class Main {
    public static void main(String[] args) {

        Product product1 = new Product();
                //set value
        product1.setName("Beko Kahve makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setUnitPrice(3);
        product1.setImageUrl("kahveMakinesi.jpg");

                //get
        //System.out.println(product1.getName());

        Product product2 = new Product();
        product2.setName("Bosch Kahve makinesi");
        product2.setUnitPrice(6500);
        product2.setDiscount(4);
        product2.setUnitsInStock(6);
        product2.setImageUrl("kahveMakinesi2.jpg");

        Product product3 = new Product();
        product3.setName("Delonghi Kahve makinesi");
        product3.setUnitPrice(8500);
        product3.setDiscount(5);
        product3.setUnitsInStock(8);
        product3.setImageUrl("kahveMakinesi3.jpg");

        Product[] products = {product1,product2,product3};
        for (Product product : products){
            System.out.println(product.getName());
        }

        System.out.println("--------------------------");
        
        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setPhoneNumber("5555555555");
        individualCustomer.setFirstName("Aybüke");
        individualCustomer.setLastName("Onay");
        individualCustomer.setNationalityId("12345678901");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCustomerNumber("67890");
        corporateCustomer.setPhoneNumber("11111111111");
        corporateCustomer.setCompanyName("kodlama.io");
        corporateCustomer.setTaxNumber("111");

        Customer[] customers = {individualCustomer,corporateCustomer};
        for (Customer customer:customers){
            System.out.println(customer.getCustomerNumber());
        }
    }
}