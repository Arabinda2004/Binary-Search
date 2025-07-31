import java.util.Arrays;
import java.util.Scanner;

public class CountOccurrencesBinarySearch {
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
        System.out.print("Enter a value: ");
        int val = sc.nextInt();
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        CountOccurrencesBinarySearch obj = new CountOccurrencesBinarySearch();
        int result = obj.occurrences(arr, val);
        if (result == 0){
            System.out.println("Element not found!");
        }
        else {
            System.out.println("Occurrences of " + val + " = " + result);
        }
        sc.close();
    }

    public int occurrences(int[] arr, int x){
        int start = 0, end = arr.length - 1;
        int first = -1, last = -1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == x){
                first = mid;
                // move left
                end = mid - 1;
            } else if (arr[mid] < x) {
                // move right
                start = mid + 1;
            }
            else {
                // move left
                end = mid - 1;
            }
        }

        if (first == -1){
            return 0;
        }

        start = 0;
        end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == x){
                last = mid;
                // move right
                start = mid + 1;
            } else if (arr[mid] < x) {
                // move right
                start = mid + 1;
            }
            else {
                // move left
                end = mid - 1;
            }
        }

         return last - first + 1;
    }
}
