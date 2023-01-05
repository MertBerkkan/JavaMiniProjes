public class Sayisal extends Aday{
    public Sayisal(int turkce, int mat, int edebiyat, int fizik,String isim) {

        super(turkce, mat, edebiyat, fizik,isim);
    }

    @Override
    public int puanHesapla() {
        return getTurkce() * 5 + getMat() * 5 + getFizik() * 4 + getEdebiyat() * 3;
    }
}
