import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjeyiOku {
    public static void main(String[] args) {

        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("ogrenci.bin"))){
            Ogrenci ogrenci = (Ogrenci) in.readObject();
            Ogrenci ogrenci1 = (Ogrenci) in.readObject();

            System.out.println("****************************");
            System.out.println(ogrenci);
            System.out.println("*****************************");
            System.out.println(ogrenci1);


        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı.");
        } catch (IOException e) {
            System.out.println("Dosya açılırken IOException oluştu.");
        } catch (ClassNotFoundException e) {
            System.out.println("Sınıf bulunamadı.");        }

    }
}
