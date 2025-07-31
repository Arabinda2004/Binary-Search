import java.util.Scanner;
import java.util.Arrays;

public class KthMissingElementBF {
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

        int i = 1;
        int missingCount = 0;
        while (true){
            if (!isPresent(arr, i)){
                missingCount++;
                if (missingCount == k){
                    System.out.println(i);
                    break;
                }
            }
            i++;
        }
    }

    public static boolean isPresent(int[] arr, int target){
        for (int el : arr){
            if (el == target){
                return true;
            }
        }
        return false;
    }
}
