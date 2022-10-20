public class Main {
    public static void main(String[] args) {

        int[] numbers = { 5, 10, 7, 27, 12 };
        int total = 0;
        int max = numbers[0];

        for(int number:numbers)
        {
            if (max < number) {
                max = number;
            }
            total = total + number;
        }

        System.out.println("Toplam : " + total);
        System.out.println("En Büyük : " + max);
    }
}