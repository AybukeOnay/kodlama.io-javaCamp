public class CustomerManager {
    private Customer customer;
    private CreditService creditService;

    public CustomerManager(Customer customer,CreditService creditService) {
        this.customer = customer;
        this.creditService = creditService;
    }

    public void save(){
        System.out.println("Müşteri kaydedildi " );
    }
    public void delete(){
        System.out.println("Müşteri silindi " );
    }

    public void giveCredit(){
        creditService.calculate();
        System.out.println("Kredi verildi");

    }
}
