public class Main {
    public static void main(String[] args) {

        String student1 = "Aybüke";
        String student2 = "Ahmet";
        String student3 = "Buse";

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println("---------------------");

        String[] students = new String[3];
        students[0]="Aybüke";
        students[1]="Ahmet";
        students[2]="Buse";

        for (int i=0;i<students.length;i++){
            System.out.println(students[i]);
        }

        System.out.println("---------------------");

        for(String student : students){
            System.out.println(student);
        }
    }
}