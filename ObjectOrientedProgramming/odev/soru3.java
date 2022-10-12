package oop.odev;

import org.w3c.dom.ls.LSOutput;

public class soru3 {
    public static void main(String[] args) {
        System.out.println("toplam: "+HesapMakinesi.toplama(10,12,14));
        System.out.println("fark: "+HesapMakinesi.cikarma(30,5,10));
        System.out.println("carpma: "+HesapMakinesi.carpma(5, 10, 2, 4));
        System.out.println("bolum: "+HesapMakinesi.bolme(100,0,4));
    }
}

class HesapMakinesi {
    public static int toplama(int... parametreler){
        int toplam = 0;
        for(int p : parametreler){
            toplam += p;
        }
        return toplam;
    }

    public static int cikarma(int... parametreler){
        int fark = parametreler[0];
        for(int p = 1; p <parametreler.length; p++){
            fark -= parametreler[p];
        }
        return fark;
    }

    public static double bolme(int... parametreler){
        double bolum = parametreler[0];
        for(int p = 1; p < parametreler.length; p++){
            if(parametreler[p] != 0) {
                bolum /= parametreler[p];
            }else{
                System.out.println("sifira bolunemez");
            }
        }
        return bolum;
    }

    public static int carpma(int... parametreler){
        int carpim = 1;
        for(int p : parametreler){
            carpim *= p;
        }
        return carpim;
    }

}
