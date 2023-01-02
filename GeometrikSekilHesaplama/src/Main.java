import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String islemler = "İşlemler...\n1. Kare Alan Hesapla\n2. Daire Alan Hesapla\n3. Üçgen Alan Hesapla\nÇIKIŞ: q";

        while (true) {
            System.out.println(islemler);
            System.out.println("HAngi şeklin alanını heaplamak istiyorsun.");

            String sekilTuru = input.nextLine().toLowerCase();
            Sekil sekil;

            if (sekilTuru.equals("q")){
                System.out.println("Programdan çıkılıyor....");
                break;
            } else if (sekilTuru.equals("1") || sekilTuru.equals("kare")) {
                System.out.print("Karenin kenarı:");

                int kenar = input.nextInt();
                input.nextLine();

                sekil = new Kare("Kare1", kenar);
                sekil.alanHesapla();
            } else if (sekilTuru.equals("2") || sekilTuru.equals("daire")) {
                System.out.print("Yarı çap: ");

                int yaricap = input.nextInt();
                input.nextLine();

                sekil = new Daire("Daire1", yaricap);
                sekil.alanHesapla();
            } else if (sekilTuru.equals("3") || sekilTuru.equals("üçgen")) {
                System.out.print("Kenar 1: ");
                int kenar1 = input.nextInt();
                System.out.print("Kenar 2: ");
                int kenar2 = input.nextInt();
                System.out.print("Kenar 3: ");
                int kenar3 = input.nextInt();
                input.nextLine();

                sekil = new Ucgen("Üçgen1", kenar1,kenar2,kenar3);
                sekil.alanHesapla();
            }

        }
    }
}