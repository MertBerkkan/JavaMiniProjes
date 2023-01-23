import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("dosya.txt", true);

          /* byte[] array = {65,66,68,84};

           fos.write(array);*/

            String s = "Mert Berkkan";

            byte[] array = s.getBytes();

            fos.write(array);

        } catch (FileNotFoundException e) {
            System.out.println("File not found exception oluştu.");
        } catch (IOException e) {
            System.out.println("Dosyaya yazılırken bir hata oluştu.");
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                System.out.println("Dosya kapatılırken bir hata oluştu.");
            }
        }
    }
}