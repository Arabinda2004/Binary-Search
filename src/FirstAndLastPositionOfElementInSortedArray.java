import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLastPositionOfElementInSortedArray {
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

        System.out.print("Enter element: ");
        int x = sc.nextInt();

        int start = 0;
        int end = n - 1;
        int first = -1, last = -1;
        while (start <= end){
            int mid = start + (end - start) /  2;
            if (arr[mid] == x){
                first = mid;
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

        start = 0;
        end = n - 1;
        while (start <= end){
            int mid = start + (end - start) /  2;
            if (arr[mid] == x){
                last = mid;
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

        System.out.println("First occurrence: " + first);
        System.out.println("Last occurrence: " + last);
    }
}
