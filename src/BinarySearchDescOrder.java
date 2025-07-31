import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchDescOrder {
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
        int x = sc.nextInt();

        BinarySearchDescOrder obj = new BinarySearchDescOrder();
        int result = obj.binarySearch(arr, x);

        if (result != -1){
            System.out.println("Element found at index: " + result);
        }
        else {
            System.out.println("Element not found!");
        }
    }

    public int binarySearch(int[] arr, int target){
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == target){
                return mid;
            }
            else if (arr[mid] > target){
                // move right
                start = mid + 1;
            }
            else {
                // move left
                end = mid - 1;
            }
        }
        return -1;
    }
}
