import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjeyiOku {
    public static void main(String[] args) {

        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("ogrenciler.bin"))){

            Ogrenci[] ogrenciArray = (Ogrenci[]) in.readObject();
            ArrayList<Ogrenci> ogrenciArrayList = (ArrayList<Ogrenci>) in.readObject();


            System.out.println("******************************");
            for (Ogrenci o : ogrenciArray){
                System.out.println(o);
                System.out.println("-----------------------------");
            }
            System.out.println("*********************************");
            for (Ogrenci o : ogrenciArrayList){
                System.out.println(o);
                System.out.println("--------------------------------");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı.");
        } catch (IOException e) {
            System.out.println("Dosya açılırken IOException oluştu.");
        } catch (ClassNotFoundException e) {
            System.out.println("Sınıf bulunamadı.");
        }
    }
}
