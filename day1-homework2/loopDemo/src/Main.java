public class Main {
    public static void main(String[] args) {
        //FOR
        //1'den 10'a kadar yazdıran for döngüsü
        for (int i = 1;i<=10;i++){
            System.out.println(i);
        }
        System.out.println("For loop is over");

        //1'den 10'a kadar tek sayıları yazdıran döngü
        for (int i = 1;i<=10;i+=2){
            System.out.println(i);
        }
        System.out.println("For loop is over");

        //1'den 10'a kadar çift sayıları yazdıran döngü
        for (int i = 2;i<=10;i+=2){
            System.out.println(i);
        }
        System.out.println("For loop is over");

        //WHILE
        int i = 1;
        while (i<10){
            System.out.println("While loop is over");
            i++;
        }

        //DO-WHILE
        int j = 1;
        do {
            System.out.println("Do-While loop is over");
            j+=2;
        }while (j<10);
    }
}