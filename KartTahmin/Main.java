package KartTahmin;

import java.util.Scanner;

public class Main {

    private static Kart [] [] kartlar = new Kart[4][4];

    public static void main(String[] args) {


        kartlar [0] [0] = new Kart('A');
        kartlar [0] [1] = new Kart('C');
        kartlar [0] [2] = new Kart('E');
        kartlar [0] [3] = new Kart('A');
        kartlar [1] [0] = new Kart('B');
        kartlar [1] [1] = new Kart('C');
        kartlar [1] [2] = new Kart('F');
        kartlar [1] [3] = new Kart('G');
        kartlar [2] [0] = new Kart('B');
        kartlar [2] [1] = new Kart('C');
        kartlar [2] [2] = new Kart('E');
        kartlar [2] [3] = new Kart('F');
        kartlar [3] [0] = new Kart('D');
        kartlar [3] [1] = new Kart('H');
        kartlar [3] [2] = new Kart('H');
        kartlar [3] [3] = new Kart('D');


        while (oyunBittiMi() == false){
            oyunTahtasi();
            tahminEt();
        }
    }

    public static void tahminEt(){
        Scanner input = new Scanner(System.in);

        System.out.println("Birinci tahmin: (i ve j değerlerini arada bir boşluk olack şekilde giriniz.)");

        int i1 = input.nextInt();
        int j1 = input.nextInt();

        if (i1 <= 4 && i1 >= 0 && j1 <= 4 && j1 >= 0){

        kartlar [i1] [j1].setTahmin(true);
        oyunTahtasi();

        System.out.println("İkinci tahmin: (i ve j değerlerini arada bir boşluk olack şekilde giriniz.)");

        int i2 = input.nextInt();
        int j2 = input.nextInt();

        if (i2 <= 4 && i2 >= 0 && j2 <= 4 && j2 >= 0)

        if (kartlar [i1] [j1].getDeger() == kartlar [i2] [j2].getDeger()){

            System.out.println("Doğru tahmin tebrikler....");

            kartlar [i2] [j2].setTahmin(true);
        }else {
            kartlar [i1] [j1].setTahmin(false);
            System.out.println("Yanlış Tahmin...");
        }
        }else {
            System.out.println("Geçersiz giriş.");
        }


    }

    public static boolean oyunBittiMi(){
        for (int i = 0; i < 4; i++){
            for (int j = 0; i < 4; j++){
                if (kartlar[i] [j].isTahmin() == false){
                    return false;
                }
            }
        }
        return true;
    }

    public static void oyunTahtasi(){

        System.out.println("-------------------");
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                if (kartlar [i] [j].isTahmin()){
                    System.out.print("|" + kartlar [i] [j].getDeger() + "|");
                }else {
                    System.out.print("| |");
                }
            }
            System.out.println();
            System.out.println("----------------");
        }
    }
}
