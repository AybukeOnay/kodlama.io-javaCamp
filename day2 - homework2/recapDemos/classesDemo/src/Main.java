public class Main {
    public static void main(String[] args) {

        DortIslem dortIslem = new DortIslem();
        int toplama = dortIslem.topla(4,3);
        System.out.println(toplama);

        int carpma = dortIslem.carp(12,6);
        System.out.println(carpma);

        int cıkartma = dortIslem.cıkar(19,5);
        System.out.println(cıkartma);

        int bolme = dortIslem.bol(12,2);
        System.out.println(bolme);
    }
}