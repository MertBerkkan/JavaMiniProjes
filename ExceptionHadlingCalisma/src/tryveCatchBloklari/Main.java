package tryveCatchBloklari;

public class Main {
    public static void main(String[] args) {

        try {
            int b = 30 / 0; //AritmeticException

            int[] a = {1, 2, 3, 4};

            System.out.println(a[6]);//ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {

            System.out.println("Bir sayı sıfıra bölünemez.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Arrayin boyunu aştınız.");
        }  /*catch (Exception e){
            System.out.println("Bir hata oluştu.");
        }*/

        System.out.println("Burası çalışıyor.");

    }
}