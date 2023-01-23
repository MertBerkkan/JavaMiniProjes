import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        FileWriter writer = null;

        try {
            writer = new FileWriter("dosya.txt",true);

            writer.write("Mert Berkkan\n");
            writer.write("Mustafa Murat\n");

        } catch (IOException e) {
            System.out.println("Dosya kapatılırken bir hata oluştu.");
        }
        finally {
            if (writer != null){
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("Dosya kapatılırken br hata oluştu.");
                }
            }
        }

    }
}