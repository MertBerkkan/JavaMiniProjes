package yurtDisiCikis;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        System.out.println("\t\tİSTANBUL HAVALİMANINA HOŞGELDİNİZ");

        String kurallar = "1) Harc miktarı yeterliliği(15000)\n2) Siyasi yasak kontrol\n3) Vize kontrol";
        String message = "Yurtdışı şartlar eksiksiz yerine getirilmeli!";

        while (true){
            System.out.println("********************************");
            System.out.println(kurallar);
            System.out.println("********************************");

            Yolcu yolcu = new Yolcu();

            System.out.println("Harç bedeli kontrol ediliyor......");

            Thread.sleep(3000);

            if (yolcu.harcDurumuKontrol() == false){

                System.out.println(message);
                continue;
            }

            System.out.println("Siyasi yasak kontrol ediliyor......");
            Thread.sleep(3000);

            if (yolcu.siyasiYasakKontrol() == false){

                System.out.println(message);
                continue;
            }

            System.out.println("Vize kontrol ediliyor......");
            Thread.sleep(3000);


            if (yolcu.vizeKontrol() == false){

                System.out.println(message);
                continue;
            }

            Thread.sleep(3000);


            System.out.println("İşlemler tamamlandı. Yurt dışına çıkabilirsiniz.");

            break;
        }
    }
}
