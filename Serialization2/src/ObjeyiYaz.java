import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class ObjeyiYaz {
    public static void main(String[] args) {

        Ogrenci ogrenci1 = new Ogrenci("Mert Berkkan", 585,"Bilgisayar Mühendisliği");
        Ogrenci ogrenci2 = new Ogrenci("Ali Fuat", 555,"Matematik");
        Ogrenci ogrenci3 = new Ogrenci("Kazım Kara", 125,"Bilgisayar Mühendisliği");

        Ogrenci[] ogrenciArray = {ogrenci1,ogrenci2,ogrenci3};
        ArrayList<Ogrenci> ogrenciArrayList = new ArrayList<Ogrenci>(Arrays.asList(ogrenciArray));





        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenciler.bin"))) {

            out.writeObject(ogrenciArray);
            out.writeObject(ogrenciArrayList);



        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı.");
        } catch (IOException e) {
            System.out.println("Dosya açılırken IOException oluştu.");

        }

    }
}