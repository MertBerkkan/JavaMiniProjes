import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik ve Fizik problemleri Programına Hoşgeldiniz");

        String islemler = "İŞLEMLER:\n1. Daire Alan Hesaplama\n2. Üçgen Çevre Hesaplama\n3. İki Vektörün İç Çarpımını " +
                "Hesaplama\nÇIKIŞ : q";

        while (true){
            System.out.println(islemler);

            System.out.print("İşlemi seçiniz: ");

            String islem = input.nextLine().toLowerCase();

            if (islem.equals("q")){
                System.out.println("Programdan çıkılıyor....");
                break;
            } else if (islem.equals("1")) {

                System.out.print("Dairenin yarı çapı: ");

                int yariCap = input.nextInt();
                input.nextLine();

                Problem.Matematik.daireAlan(yariCap);
            } else if (islem.equals("2")) {

                System.out.print("Kenar 1: ");

                int kenar1 = input.nextInt();

                System.out.print("Kenar 2: ");

                int kenar2 = input.nextInt();

                System.out.print("Kenar 3: ");

                int kenar3 = input.nextInt();
                input.nextLine();

                Problem.Matematik.ucgenCenresi(kenar1, kenar2, kenar3);
            } else if (islem.equals("3")) {

                Vec vec = new Vec("Vektör 1");
                Vec vec1 = new Vec("Vektör 2");

                Problem.Fizik.icCarpim(vec,vec1);

            }else {
                System.out.println("Hatalı giriş yaptınız.Tekrar Deneyiniz.");
            }
        }
    }
}