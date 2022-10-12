package Arrays.odevler;

public class soru3 {
    public static void main(String[] args) {
        String[] iskambil = new String[52];
        desteOlustur(iskambil);
        desteYazdir(iskambil);
        desteKar(iskambil);
        desteYazdir(iskambil);
        desteDort(iskambil);

    }

    public static void desteOlustur(String[] deste) {
        String[] dortKart = {"Kupa", "Karo", "Maca", "Sinek"};
        String[] numaralar = {"As","2","3","4","5","6","7","8","9","10","J","Q","K"};

        int n = 0;
        for(int i = 0; i < dortKart.length; i++)
            for(int j = 0; j < numaralar.length; j++){
                deste[n] = dortKart[i] + " " + numaralar[j];
                n++;
            }
        }

    public static void desteYazdir(String[] deste){
        for(String i : deste){
            System.out.println(i);
        }

    }

    public static void desteKar(String[] deste){
            for(int i = deste.length - 1; i>0; i--){
                int j = (int)(Math.random()*(i+1));
                String temp = deste[i];
                deste[i] = deste[j];
                deste[j] = temp;
            }
    }

    public static void desteDort(String[] deste){
        System.out.println("ilk dort kart:");
        for(int i = 0; i < 4; i++)
            System.out.println(deste[i]);
    }
}
