package SarkiciProje;

import java.util.ArrayList;
import java.util.SplittableRandom;

public class Sarkicilar {

    private ArrayList<String> sarkiciListesi = new ArrayList<String>();

    public void sarkicilariBastir (){

        System.out.println("Şarkıcı listesinde " + sarkiciListesi.size() + " tane şarkıcı vardır.");

        for (int i = 0; i < sarkiciListesi.size(); i++){
            System.out.println((i + 1) + ". şarkıcı : " + sarkiciListesi.get(i));
        }
    }

    public void sarkiciEkle(String isimEkle){
        sarkiciListesi.add(isimEkle);

        System.out.println("Liste güncelleniyor....");
    }

    public void sarkiciCikar(int pozizyon){
        String isim = sarkiciListesi.get(pozizyon);

        sarkiciListesi.remove(pozizyon);

        System.out.println(isim + " isimli şarkıcı listeden çıkartıldı.");
    }

    public void sarkiciGuncelle(String isim, int pozizyon){

        sarkiciListesi.set(pozizyon, isim);

        System.out.println("Liste güncelleniyor....");
    }

    public void sarkiciAra(String isim){
        int pozizyon = sarkiciListesi.indexOf(isim);

        if (pozizyon >= 0){
            System.out.println("Şarkıcı bulundu...\n" + (pozizyon + 1) + ". şarkıcı " + isim);
        }else {
            System.out.println("Şarkıcı bulunamadı.");
        }
    }
}