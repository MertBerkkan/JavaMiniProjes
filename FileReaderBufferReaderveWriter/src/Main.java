import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("ogrenciler.txt")))){

            while(scanner.hasNextLine()){

                String ogrenci_bilgisi = scanner.nextLine();

                String[] array = ogrenci_bilgisi.split(",");

                if (array[1].equals("Bilgisayar Mühendisliği")){
                    System.out.println("Öğrenci Bilgisi: " + ogrenci_bilgisi);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı...");
        } catch (IOException e) {
            System.out.println("Dosya açılırken hata oluştu.");        }

    }
}