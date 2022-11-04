public class Main {
    public static void main(String[] args) {
        //interface onu imlemente eden sınıfın referans tutucusudur.
        CustomerDal customerDal = new MySqlCustomerDal();


        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        customerManager.add();

    }
}