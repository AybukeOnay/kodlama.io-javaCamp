public class Main {
    public static void main(String[] args) {

        char grade = 'B';

        switch (grade){
            case 'A':
                System.out.println("Perfect : You passed");
                break;
            case 'B':
                System.out.println("Very good : You passed");
                break;
            case 'C':
                System.out.println("Good : You passed");
                break;
            case 'D':
                System.out.println("Not bad : You passed");
                break;
            case 'F':
                System.out.println("You couldn't pass");
                break;
            default:
                System.out.println("You entered invalid grade");
        }

    }
}