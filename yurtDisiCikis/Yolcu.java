package yurtDisiCikis;

import java.util.Scanner;

public class Yolcu implements YurtDisiKurallari {

    private int harc;

    private String siyasiYasak;

    private String vize;

    public Yolcu(){

        Scanner input = new Scanner(System.in);

        System.out.println("Harç ücretinizi giriniz.");
        this.harc = input.nextInt();

        input.nextLine();

        System.out.println("Siyasi bir yasağınız var mı?(Evet-Hayır)");

        this.siyasiYasak = input.nextLine().toLowerCase();

        System.out.println("Ülke için vizeniz var mı?(Evet-Hayır)");

        this.vize = input.nextLine().toLowerCase();

    }

    @Override
    public boolean harcDurumuKontrol() {
        if (this.harc < 15000){
            System.out.println("Harc ödemeniz eksiktir.");
            return false;
        } else if (this.harc >15000) {
            System.out.println("Harc ödemeniz fazla yatmış.Para iadesi bankanıza yapılmıştır.");
            return true;
        }
        System.out.println("Harc ödemeniz alınmıştır.");
        return true;
    }


    @Override
    public boolean siyasiYasakKontrol() {
        if (this.siyasiYasak.equals("evet")){
            System.out.println("Siyasi yasağınız nedeniyle yurt dışına çıkamazsınız.");
            return false;
        } else if (this.siyasiYasak.equals("hayır")) {
            return true;
        }else {
            System.out.println("Yanlış giriş yaptınız.(Evet-Hayır");
            return false;
        }
    }

    @Override
    public boolean vizeKontrol() {
        if (this.vize.equals("hayır")){
            System.out.println("Vize eksikliği nedeniyle yurt dışına çıkamazsınız.");
            return false;
        } else if (this.vize.equals("evet")) {
            return true;
        }else {
            System.out.println("Yanlış giriş yaptınız.(Evet-Hayır");
            return false;
        }
    }
}
