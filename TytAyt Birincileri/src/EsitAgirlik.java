public class EsitAgirlik extends Aday {
    public EsitAgirlik(int turkce, int mat, int edebiyat, int fizik,String isim) {

        super(turkce, mat, edebiyat, fizik,isim);
    }

    @Override
    int puanHesapla() {

        return getTurkce() * 5 + getMat() * 3 + getFizik() * 1 + getEdebiyat() * 5;
    }
}
