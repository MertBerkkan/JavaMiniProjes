package SehirTuru;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void islemleriBastir() {

        System.out.println("0 - İşlemleri Görüntüle.");
        System.out.println("1 - Bir sonraki şehre git.");
        System.out.println("2 - Bir önceki şehre git.");
        System.out.println("3 - Çıkış.");

    }

    public static void sehirleriTurla(LinkedList<String> sehirler) {
        ListIterator<String> iterator = sehirler.listIterator();

        islemleriBastir();

        Scanner input = new Scanner(System.in);

        if (!iterator.hasNext()) {

            System.out.println("Herhangi bir şehir bulunamıyor.");
        }

        boolean cikis = false;
        boolean ileri = true;

        while (!cikis) {

            System.out.println("Bir işlem seçiniz.");

            int islem = input.nextInt();

            switch (islem) {
                case 0:
                    islemleriBastir();

                    break;
                case 1:
                    if (!ileri) {
                        if (iterator.hasNext()) {
                            iterator.next();
                        }
                        ileri = true;
                    }
                    if (iterator.hasNext()) {

                        System.out.println("Şehre gidiliyor..." + iterator.next());
                    } else {
                        System.out.println("Gidilecek şehir kalmadı.");
                        ileri = true;
                    }
                    break;
                case 2:

                    if (ileri) {
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                        }
                        ileri = false;
                    }
                    if (iterator.hasPrevious()) {
                        System.out.println("Şehre gidiliyor...." + iterator.previous());
                    } else {
                        System.out.println("Şehir turu başladı.");
                    }
                    break;
                case 3:
                    cikis = true;
                    System.out.println("Uygulamadan çıkılıyor...");
                    break;

                default:

                    System.out.println("Hatalı giriş yaptınız.");

            }

        }

    }


    public static void main(String[] args) {


        LinkedList<String> sehirler = new LinkedList<String>();

        sehirler.add("Trabzon");
        sehirler.add("Tekirdağ");
        sehirler.add("İstanbul");
        sehirler.add("Kocaeli");
        sehirler.add("Çanakkale");

        sehirleriTurla(sehirler);
    }
}
