package SarkiciProje;

import java.util.Scanner;

public class Test {

    private static Sarkicilar sarkicilar = new Sarkicilar();
    private static Scanner input = new Scanner(System.in);

    public static void islemleriBastir(){

        System.out.println("\t0 - İşlemleri Görüntüle");
        System.out.println("\t1 - Şarkıcıları Görüntüle");
        System.out.println("\t2 - Şarkıcı Ekle");
        System.out.println("\t3 - Şarkıcı Çıkar");
        System.out.println("\t4 - Şarkıcı Bul");
        System.out.println("\t5 - Şarkıcı Güncelle");
        System.out.println("\t6 - ÇIKIŞ");
    }
    public static void main(String[] args) {

        System.out.println("ŞARKICI UYGULAMASINA HOŞGELDİNİZ.");

        islemleriBastir();

        boolean cikis = false;

        int islem;

        while (!cikis){
            islem = input.nextInt();

            input.nextLine();

            switch (islem){
                case 0:
                    islemleriBastir();
                    break;
                case 1:
                    goruntule();
                    break;
                case 2:
                    ekle();
                    break;
                case 3:
                    cikar();
                    break;
                case 4:
                    bul();
                    break;
                case 5:
                    guncelle();
                    break;
                case 6:
                    cikis = true;
                    System.out.println("Uygulamadan çıkılıyor...");
            }
        }


    }

    public static void goruntule() {
        sarkicilar.sarkicilariBastir();
    }

    public static void ekle () {

        System.out.println("Lütfen eklemek istediğiniz şarkıcıyı giriniz.");

        String isim = input.nextLine();

        sarkicilar.sarkiciEkle(isim);
    }

    public static void cikar(){

        System.out.println("Çıkarmak istediğiniz kişinin numarasını giriniz.(ÖRN: 1,2,3,....");

        int numara = input.nextInt();
        input.nextLine();

        sarkicilar.sarkiciCikar(numara - 1);
    }

    public static void bul(){

        System.out.println("Aramak istediğiniz şarkıcıyı yazınız.");

        String isim = input.nextLine();

        sarkicilar.sarkiciAra(isim);
    }

    public static void guncelle() {

        System.out.println("Güncellemek istediğiniz kişinin numarasını girin.");

        int numara = input.nextInt();
        input.nextLine();

        System.out.println("Yerine eklemek istediğiniz şarkıcıyı giriiz.");

        String isim = input.nextLine();

        sarkicilar.sarkiciGuncelle(isim, numara - 1);
    }
}
