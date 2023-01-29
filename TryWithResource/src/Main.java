import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try(FileWriter writer = new FileWriter("diller.txt")){

            Scanner input = new Scanner(System.in);
            String dil;

            while (true){

                System.out.println("Bir dil giriniz:");
                dil = input.nextLine();

                if (dil.equals("-1")){
                    System.out.println("Programdan çıkılıyor...");
                    System.out.println("Dosyayı kontrol ediniz");
                    break;
                }
                 writer.write(dil + "\n");

            }

        } catch (IOException e) {
            System.out.println("Dosya oluştururken hata oluştu.");
        }


    }
}