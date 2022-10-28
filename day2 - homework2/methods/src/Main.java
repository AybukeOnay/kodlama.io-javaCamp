public class Main {
    public static void main(String[] args) {
        ekle();
        int toplam=topla(5,7);
        System.out.println(toplam);
        int toplam2 = topla2(3,12,33,567);
        System.out.println(toplam2);

    }

    public static void ekle(){
        System.out.println("Eklendi");
    }

    public static int topla(int sayi1,int sayi2){
        return sayi1+sayi2;
    }

    //variable arguments
    public static int topla2(int... sayilar){
        int toplam = 0;
        for(int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }
}