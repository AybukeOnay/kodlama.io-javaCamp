public class Main {
    public static void main(String[] args) {
        BaseLogger[] loggers = new BaseLogger[]{new DatabaseLogger(),new FileLogger(),new EmailLogger(),new ConsoleLogger()};
        for (BaseLogger logger : loggers){
            logger.log("Log mesajı");
        }
        System.out.println("-------------------------------------");

        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();
    }
}