package Arrays.odevler;

public class soru1 {
    public static void main(String[] args) {

        int[] randomArray = new int[100];
        System.out.println(randomArray.length);

        for(int i = 0; i<100; i++) {
            randomArray[i] = (int) (Math.random() * 100) + 1;
            System.out.print(randomArray[i]+",");
        }

        int sum = 0;
        for(int i : randomArray)
            sum += i;

        double mean = (double)sum/randomArray.length;
        int n = 0;
        for(int i : randomArray){
            if(i<mean)
                n++;
        }
        System.out.println("\nMean of all random numbers: "+mean);
        System.out.println("Number of numbers smaller than the mean: "+n);

    }
}
