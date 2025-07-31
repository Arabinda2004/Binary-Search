import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCowsBS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Read input
        System.out.print("Enter number of stalls: ");
        int n = sc.nextInt();
        int[] stall = new int[n];
        System.out.println("Enter stall positions one by one:");
        for (int i = 0; i < n; i++) {
            stall[i] = sc.nextInt();
        }

        System.out.print("Enter number of cows to place: ");
        int cows = sc.nextInt();

        // Step 2: Sort stall positions
        Arrays.sort(stall);

        // Binary search on minimum distance between cows
        int start = 1;  // We can't have 0 distance between cows
        int end = stall[n - 1] - stall[0];  // Max possible distance
        int ans = 0;

        System.out.println("\n--- Binary Search Steps ---");
        while (start <= end) {
            int mid = start + (end - start) / 2;  // Try placing cows with at least 'mid' distance
            int count = 1;  // Always place the first cow at the first stall
            int lastCowPos = stall[0];  // Track last cow's position

            // Try to place the rest of the cows
            for (int i = 1; i < n; i++) {
                if (stall[i] >= lastCowPos + mid) {
                    count++;
                    lastCowPos = stall[i];  // Update last placed cow position
                }
            }

            // Debug output
            System.out.println("Trying minimum distance: " + mid + " -> Cows placed: " + count);

            // If we can place at least the required number of cows
            if (count >= cows) {
                ans = mid;  // mid is a valid answer, try to find a bigger one
                start = mid + 1;
                System. out.println("✔️  Valid - Trying larger distance");
            } else {
                end = mid - 1;  // mid is too big, reduce it
                System.out.println("❌  Not enough cows - Trying smaller distance");
            }
        }

        // Final output
        System.out.println("\n✅ Largest minimum distance possible between cows: " + ans);
        sc.close();
    }
}



















//import java.util.Arrays;
//import java.util.Scanner;
//
//public class AggressiveCowsBF {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number of stalls: ");
//        int n = sc.nextInt();
//        int[] stall = new int[n];
//        System.out.println("Enter values one by one");
//        for (int i = 0; i < n; i++){
//            stall[i] = sc.nextInt();
//        }
//        System.out.print("Enter number of cows: ");
//        Arrays.sort(stall);
//        int cows = sc.nextInt();
//        int ans =  0;
//        int start = 1;
//        int end = stall[n - 1] - stall[0];
//        while (start <= end){
//            int mid = start + (end -  start) / 2;
//            int count = 1;
//            int lastCowPos = stall[0];
//            for (int i = 1; i < n; i++){
//                if (lastCowPos + mid <= stall[i]){
//                    count++;
//                    lastCowPos = stall[i];
//                }
//            }
//            if (count < cows){
//                end = mid - 1;
//            }
//            else { // count >= cows
//                ans = mid;
//                start = mid + 1;
//            }
//        }
//
//        System.out.println(ans);
//        sc.close();
//    }
//}
