import java.util.Arrays;
import java.util.Scanner;

public class KthMissingElementBS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            System.out.print("Enter " + (i+1) + " element: ");
            int val = sc.nextInt();
            arr[i] = val;
        }
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int start = 0, end = n - 1;
        int index = n;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] - mid - 1 >= k){
                index = mid;
                // move left
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        System.out.println(k + "-th missing element = " + (index + k));
    }
}
