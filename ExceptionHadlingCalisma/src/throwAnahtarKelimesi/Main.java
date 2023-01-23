package throwAnahtarKelimesi;

import java.util.Scanner;

public class Main {

    public static void yasKontrol(int yas){

        if (yas < 18){
            throw new ArithmeticException();
        }else {
            System.out.println("Mekana hoşgeldiniz.");
        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Yaşınızı giriniz: ");

        int yas = input.nextInt();

        try{
            yasKontrol(yas);
        }
        catch (ArithmeticException e){

            System.out.println("18 yaşından küçükler giremez.");
        }
    }
}
