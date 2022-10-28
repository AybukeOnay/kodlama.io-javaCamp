public class Main {
    public static void main(String[] args) {

        //variableType
        int number1 = 10;
        int number2 = 20;
        number2 = number1;
        number1 = 30;
        System.out.println(number2);

        //referenceType
        int[] numbers1 = {1,2,3,4,5,6};
        int[] numbers2 = {7,8,9,10,11};
        numbers2 = numbers1;
        numbers1[0] = 12;
        System.out.println(numbers2[0]);
    }
}