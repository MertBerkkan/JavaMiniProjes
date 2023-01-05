package YoneticiCalisan;

public class Test {
    public static void main(String[] args) {


        Yonetici yonetici1 = new Yonetici("Mert Berkkan", 25000, "IT", 10);

        yonetici1.bilgileriGoster();

        yonetici1.zam_yap(2500);

        yonetici1.calis();
    }
}
