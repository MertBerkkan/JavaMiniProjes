import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("TYT AYT BİRİNCİ BULMA PROGRAMINA HOŞGELNİZ....");
        Scanner input = new Scanner(System.in);

        String islemler = "**İŞLEMLER**\n1 Eşit Ağırlık Birincisi\n2 Sayısal Birincisi\n ÇIKIŞ için q'ya basınız.";

        System.out.println("************************************");
        System.out.println(islemler);
        System.out.println("************************************");

        while (true){

            System.out.println("Çıkış için q ya basınız.\nDevam etmek için herhangi bir tuşa basınız.");
            String islem1 = input.nextLine();
            if (islem1.equals("q")){
                System.out.println("Programdan çıkılıyor...");
                break;
            }

            //BİRİNCİ ÖĞRENCİ
            System.out.print("Birinci öğrenci ismi:");
            String isim1 = input.nextLine();

            System.out.print("Netler(Türkçe-Matematik-Edebiyat-Fizik): ");
            int turkce1 = input.nextInt();
            int mat1 = input.nextInt();
            int edebiyat1 = input.nextInt();
            int fizik1 = input.nextInt();
            input.nextLine();

            //İKİNCİ ÖĞRENCİ
            System.out.print("İkinci öğrenci ismi:");
            String isim2 = input.nextLine();

            System.out.print("Netler(Türkçe-Matematik-Edebiyat-Fizik): ");
            int turkce2 = input.nextInt();
            int mat2 = input.nextInt();
            int edebiyat2 = input.nextInt();
            int fizik2 = input.nextInt();
            input.nextLine();

            //ÜÇÜNCÜ ÖĞRENCİ
            System.out.print("Üçüncü öğrenci ismi:");
            String isim3 = input.nextLine();

            System.out.print("Netler(Türkçe-Matematik-Edebiyat-Fizik): ");
            int turkce3 = input.nextInt();
            int mat3 = input.nextInt();
            int edebiyat3 = input.nextInt();
            int fizik3 = input.nextInt();
            input.nextLine();

            //DÖRTÜNCÜ ÖĞRENCİ
            System.out.print("Dörtüncü öğrenci ismi:");
            String isim4 = input.nextLine();

            System.out.print("Netler(Türkçe-Matematik-Edebiyat-Fizik): ");
            int turkce4 = input.nextInt();
            int mat4 = input.nextInt();
            int edebiyat4 = input.nextInt();
            int fizik4 = input.nextInt();
            input.nextLine();

            System.out.print("İşlemi giriniz:");

            String islem = input.nextLine();

             if (islem.equals("1")) {
               EsitAgirlik ogrenci1 = new EsitAgirlik(turkce1,mat1,edebiyat1,fizik1,isim1);
               EsitAgirlik ogrenci2 = new EsitAgirlik(turkce2,mat2,edebiyat2,fizik2,isim2);
               EsitAgirlik ogrenci3 = new EsitAgirlik(turkce3,mat3,edebiyat3,fizik3,isim3);
               EsitAgirlik ogrenci4 = new EsitAgirlik(turkce4,mat4,edebiyat4,fizik4,isim4);

               EsitAgirlik birinci = birinci(ogrenci1,ogrenci2,ogrenci3,ogrenci4);

                System.out.println("Birinci eşit ağırlık öğrencisi: " + birinci.getIsim() + "\nPuanı: " + birinci.puanHesapla());


            } else if (islem.equals("2")) {
                Sayisal ogrenci1 = new Sayisal(turkce1,mat1,edebiyat1,fizik1,isim1);
                Sayisal ogrenci2 = new Sayisal(turkce2,mat2,edebiyat2,fizik2,isim2);
                Sayisal ogrenci3 = new Sayisal(turkce3,mat3,edebiyat3,fizik3,isim3);
               Sayisal ogrenci4 = new Sayisal(turkce4,mat4,edebiyat4,fizik4,isim4);

                Sayisal birinci = birinci(ogrenci1,ogrenci2,ogrenci3,ogrenci4);

                System.out.println("Birinci sayısal öğrencisi: " + birinci.getIsim() + "\nPuanı: " + birinci.puanHesapla());

            }else {
                System.out.println("Hatalı giriş yaptınız.");
            }
        }
    }

    public static <E extends Aday> E birinci(E e1, E e2, E e3, E e4) {
        if (e1.puanHesapla() > e2.puanHesapla() && e1.puanHesapla() > e3.puanHesapla() && e1.puanHesapla() > e4.puanHesapla()) {
            return e1;
        } else if (e2.puanHesapla() > e1.puanHesapla() && e2.puanHesapla() > e3.puanHesapla() && e2.puanHesapla() > e4.puanHesapla()) {
            return e2;
        } else if (e3.puanHesapla() > e2.puanHesapla() && e3.puanHesapla() > e1.puanHesapla() && e3.puanHesapla() > e4.puanHesapla()) {
            return e3;
        } else if (e4.puanHesapla() > e2.puanHesapla() && e4.puanHesapla() > e3.puanHesapla() && e4.puanHesapla() > e1.puanHesapla()) {
            return e4;
        } else {
            return e1;
        }
    }
}
