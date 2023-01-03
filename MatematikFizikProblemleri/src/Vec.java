import java.util.Scanner;

public class Vec {

    private String isim;
    private int i;
    private int j;
    private int k;

    public Vec(String isim){
        this.isim = isim;

        Scanner input = new Scanner(System.in);

        System.out.println("Vektörün i, j ve k değerlerini giriniz.");

        System.out.print("i:");
        this.i = input.nextInt();

        System.out.print("j:");
        this.j = input.nextInt();

        System.out.print("k:");
        this.k = input.nextInt();

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }
}
