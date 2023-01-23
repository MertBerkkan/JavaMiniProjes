import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjeyiYaz {
    public static void main(String[] args) {

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenci.bin"))) {

            Ogrenci ogrenci = new Ogrenci("Mert Berkkan", 585,"Bilgisayar Mühendisliği");
            Ogrenci ogrenci1 = new Ogrenci("Mehmet ALi", 213,"Matematik");

            out.writeObject(ogrenci);
            out.writeObject(ogrenci1);

        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı.");
        } catch (IOException e) {
            System.out.println("Dosya açılırken IOException oluştu.");

        }

    }
}