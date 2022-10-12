package Arrays.odevler;

import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {
        ekokBul();
    }

    public static void ekokBul()    {
        Scanner tara = new Scanner(System.in);
        System.out.println("ilk sayiyi giriniz");
        int m = tara.nextInt();
        int ilkSayi = m;
        System.out.println("ikinci sayiyi giriniz");
        int n = tara.nextInt();
        int ikinciSayi = n;

        int r = 1;
        int ebob;
        int ekok;
        if(m>n){
            while(m%n != 0){
                r = m%n;
                m = n;
                n = r;

            }
            ebob = n;
            System.out.println("EBOB: "+ebob);
        }
        else{
            while(n%m != 0){
                r = n%m;
                n = m;
                m = r;

            }
            ebob = m;
            System.out.println("EBOB: "+ebob);
        }
        ekok = ilkSayi*ikinciSayi/ebob;
        System.out.println("EKOK: "+ekok);




    }
}
