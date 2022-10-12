package oop.odev;

public class soru4 {
    public static void main(String[] args) {

    }
}

class Hesap {
    int hesapNo;
    int hesaptakiPara;
    int paraCekmeSayisi;
    int paraYatirmaSayisi;
    static int hesapSayisi;

    public Hesap(int hesapNo){
        this.hesapNo = hesapNo;
        hesapSayisi++;
    }

    public void paraCekme(int miktar){
        hesaptakiPara -= miktar;
    }
    public void paraYatir(int miktar){
        hesaptakiPara += miktar;
    }
}
