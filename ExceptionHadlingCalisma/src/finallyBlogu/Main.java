package finallyBlogu;

public class Main {
    public static void main(String[] args) {

        try {
            int b = 45 / 0;
        }
        catch (NullPointerException e){
            System.out.println("Bir sayı o a bölünemez.");
        }
        finally {
            System.out.println("Finally hep çalışır.");
        }

        System.out.println("Çalışmıycak");
    }
}
