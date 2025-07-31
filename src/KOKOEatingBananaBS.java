import java.util.Scanner;

public class KOKOEatingBananaBS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pile size: ");
        int n = sc.nextInt();
        int[] piles = new int[n];
        for (int i =0; i < n; i++){
            System.out.print("Enter number of bananas in pile " + (i+1) + ": ");
            piles[i] = sc.nextInt();
        }
        System.out.print("Enter hours: ");
        int hours = sc.nextInt();
        int start = 1;
        int end = Integer.MIN_VALUE;
//        int sum = 0;
        for (int val: piles){
//            sum += val;
            if (val > end){
                end = val;
            }
        }
//        start = sum / hours;
        int ans = 0;
        while (start <= end){
            int mid = start + (end - start) / 2;
            int timetaken = 0;
            for (int val: piles){
                timetaken += val/mid;
                if (val%mid != 0){
                    timetaken += 1;
                }
            }
            if (timetaken <= hours){
               ans = mid;
               end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        System.out.println("Answer: " + ans);
    }
}
