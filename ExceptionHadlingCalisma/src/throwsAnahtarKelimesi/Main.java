package throwsAnahtarKelimesi;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void mekanKontrol2(int yas) throws IOException {

        if (yas < 18) {
            throw new IOException();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Yaşınızı giriniz: ");

        int yas = input.nextInt();

        try {
            mekanKontrol2(yas);
        } catch (IOException e) {
            System.out.println("18 yaşından küçükler giremez. ");
        }

    }

}
