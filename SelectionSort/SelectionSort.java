package SelectionSort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] sayilar = {-5,-10,7,3,82,4,5,-1000,-1250,300,200,99, 8, 8, 7 ,6, 8, 1};
        selectionSort(sayilar);
        diziYazdir(sayilar);
    }
    public static void selectionSort(int[] dizi){
        for(int i = 0; i < dizi.length - 1; i++){
            int mSmall = dizi[i];
            int mSmallIndex = i;
            for(int j = i+1; j < dizi.length - 1; j++){
                if(mSmall > dizi[j]){
                    mSmall = dizi[j];
                    mSmallIndex = j;
                }
            }
            if(mSmallIndex != i){
                dizi[mSmallIndex] = dizi[i];
                dizi[i] = mSmall;
            }
        }
    }
    public static void diziYazdir(int[] dizi){
        for(int i = 0; i < dizi.length - 1; i++){
            System.out.println(dizi[i]);
        }
    }
}