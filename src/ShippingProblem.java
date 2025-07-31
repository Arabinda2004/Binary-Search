import java.util.Arrays;
import java.util.Scanner;

public class ShippingProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of packages: ");
        int n = sc.nextInt();
        int[] packages = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print("Enter weight of package " + (i+1) + ": ");
            int value = sc.nextInt();
            packages[i] = value;
        }
        System.out.println("Packages array: " + Arrays.toString(packages));

        System.out.println("Enter number of days: ");
        int k = sc.nextInt();

        int start = packages[0];
        int end = 0;
        int ans = 0;
        for (int val: packages){
            end += val;
            if (val > start){
                start = val;
            }
        }

        while (start <= end){
            int mid = start + (end - start) / 2;
            int weights = 0, count = 1;
            for (int val: packages){
                weights += val;
                if (weights > mid){
                    count++;
                    weights = val;
                }
            }

            if (count <= k){
                ans = mid;
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        System.out.println("Minimum ship capacity: " + ans + " units");
    }
}
