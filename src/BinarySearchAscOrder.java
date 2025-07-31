import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchAscOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter " + (i+1) + " element: ");
            int val = sc.nextInt();
            arr[i] = val;
        }
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.print("Enter element to search: ");
        int target = sc.nextInt();
        int start = 0;
        int end = arr.length - 1;
        int result = -1;
        int rounds = 0;
        while (start <= end) {
            ++rounds;
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                result = mid;
                break;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if (result != -1){
            System.out.println("Element found at index " + result);
        }
        else {
            System.out.println("Element not found!");
        }
        System.out.println("Number of iterations: " + rounds);
    }
}
