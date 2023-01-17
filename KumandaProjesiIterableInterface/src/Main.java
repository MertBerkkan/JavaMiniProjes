import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Kumanda programına hoşgeldiniz......");

        Scanner input = new Scanner(System.in);

        String islemler = "İŞLEMLER\n1  - Kanalları Göster\n2  - Kanal Ekle\n3  - Kanal Sil\n4  - Kanal Sayısını Göster\n ÇIKIŞ : q";

        Kumanda kumanda = new Kumanda();

        System.out.println(islemler);
        while (true) {
            System.out.println("İşlemi Girin:");

            String islem = input.nextLine().toLowerCase();

            if (islem.equals("q")) {
                System.out.println("Programdan çıkılıyor...");
                break;
            } else if (islem.equals("1")) {

                kanallariGoster(kumanda);
            } else if (islem.equals("2")) {
                System.out.print("Eklemek istediğiniz kanalı giriniz: ");
                String kanalIsim = input.nextLine();

                kumanda.kanalEkle(kanalIsim);

            } else if (islem.equals("3")) {
                System.out.print("Silmek istediğiniz kanalı giriniz: ");
                String kanalIsim2 = input.nextLine();

                kumanda.kanalSil(kanalIsim2);

            } else if (islem.equals("4")) {

                System.out.println("Kanal sayısı: " + kumanda.kanalSayisi());
            } else {
                System.out.println("Geçersiz işlem girdiniz.");
            }
        }

    }

    public static void kanallariGoster(Kumanda kumanda) {
        if (kumanda.kanalSayisi() == 0) {
            System.out.println("Kanal Bulunamadı.");

        } else {

            for (String kanal : kumanda) {

                System.out.println("Kanal: " + kanal);
            }
        }
    }
}