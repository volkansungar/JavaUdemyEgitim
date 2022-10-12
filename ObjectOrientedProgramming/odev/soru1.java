package oop.odev;

public class soru1 {
    public static void main(String[] args) {

        CemberDaire cember1 = new CemberDaire(5);
        System.out.printf("cevre: %.2f \n", cember1.cevreBul());
        System.out.printf("alan: %.2f ", cember1.alanBul());

    }
}

class CemberDaire {
    private int yaricap;
    public final static double PI = 3.14;

    public CemberDaire(int r){
        this.yaricap = r;
    }

    public double cevreBul(){
        return 2 * PI * yaricap;
    }

    public double alanBul(){
        return Math.pow(yaricap,2) * PI;
    }
}
