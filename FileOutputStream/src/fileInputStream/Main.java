package fileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("dosya2.txt");

            String s = "";
            int deger ;

            while ((deger = fis.read()) != -1){

                s += (char) deger ;
            }

            System.out.println("Dosya içeriği : " + s);
        } catch (FileNotFoundException e) {
            System.out.println("File bulunamadı.");
        } catch (IOException e) {
            System.out.println("Bir hata oluştu.");
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                System.out.println("Dosya kapatılırken bir hata oluştu.");
            }
        }
    }
}
