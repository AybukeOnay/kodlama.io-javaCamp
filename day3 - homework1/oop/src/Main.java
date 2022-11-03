public class Main {
    public static void main(String[] args) {

        CreditManager creditManager = new CreditManager();
        creditManager.calculate();
        creditManager.save();

        System.out.println("--------------------------------------------");

        Customer customer = new Customer();
        customer.setId(1);

        //CustomerManager customerManager = new CustomerManager(customer);
        //customerManager.save();
        //customerManager.delete();

        Company company = new Company();
        company.setTaxNumber("1234");
        company.setCompanyName("Arçelik");
        company.setId(100);

        Person person = new Person();
        person.setNationalityId("12345678901");
        person.setFirstName("Aybüke");
        person.setLastName("Onay");

        CustomerManager customerManager1 = new CustomerManager(new Person(),new TeacherCreditManager());
        customerManager1.save();
        customerManager1.giveCredit();


    }
}

