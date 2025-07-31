public class KOKOEatingBananaBF {
    public static void main(String[] args) {
        double[] piles = {3, 6, 11, 7};
        int n = 4;
        int hours = 8;
        for (int i = 1; i < Integer.MAX_VALUE; i++){
        double timeTaken = 0;
            for (int j = 0; j < n; j++){
                double time = piles[j] / i;
                time = Math.ceil(time);
                timeTaken += time;
            }
            if (timeTaken <= hours){
                System.out.println(i);
                break;
            }
        }
    }
}
