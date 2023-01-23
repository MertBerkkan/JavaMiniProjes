package kendiExceptionClassOlusturma;

import java.util.Scanner;

public class Main {

    public static void mekanKontrol3(int yas) throws IncalidAgeException {
        if (yas < 18){
            throw new IncalidAgeException("Incalid Exception");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Yaşınızı giriniz: ");

        int yas = input.nextInt();

        try {
            mekanKontrol3(yas);
        }

        catch (IncalidAgeException e){
            e.printStackTrace();
        }
    }
}
