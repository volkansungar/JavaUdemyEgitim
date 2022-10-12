package oop.odev;

public class soru2 {
    public static void main(String[] args) {

        Ogrenci[] tumOgrenciler = new Ogrenci[100];

        for(int i = 0; i < 100; i++){
            int rastgeleID = (int)(Math.random()*5000);
            int rastgeleNot = (int)(Math.random()*100);

            Ogrenci yeni = new Ogrenci(rastgeleID, rastgeleNot);
            tumOgrenciler[i] = yeni;

        }
        notaSirala(tumOgrenciler);
        for(int i = 0; i < 100; i++){
            tumOgrenciler[i].bilgiYazdir();

        }

    }

    public static void notaSirala(Ogrenci[] tumOgrenciler){
        for(int i = 0; i < tumOgrenciler.length - 1; i++){
            int mSmall = tumOgrenciler[i].getNot();
            int mSmallIndex = i;
            Ogrenci permOgrenci = new Ogrenci(0,0);
            for(int j = i+1; j < tumOgrenciler.length; j++){
                if(mSmall > tumOgrenciler[j].getNot()){
                    mSmall = tumOgrenciler[j].getNot();
                    mSmallIndex = j;
                    permOgrenci = tumOgrenciler[j];
                }
            }
            if(mSmallIndex != i){
                tumOgrenciler[mSmallIndex] = tumOgrenciler[i];
                tumOgrenciler[i] = permOgrenci;
            }
        }
    }
}

class Ogrenci {
    private int id;
    private int not;

    public Ogrenci(int id, int not) {
        this.id = id;
        this.not = not;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNot() {
        return not;
    }

    public void setNot(int not) {
        this.not = not;
    }

    public void bilgiYazdir(){
        System.out.println("id: "+id+" not: "+not);
    }
}
