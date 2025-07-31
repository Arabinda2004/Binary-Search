import java.util.Arrays;
import java.util.Scanner;

public class CorrectPositionOfElementInSortedArray {
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

        int index = n;
        int start = 0, end = n - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == x){
                index = mid;
                break;
            }
            else if (arr[mid] > x){
                // move left and assign index value
                end = mid - 1;
                index = mid;
            }
            else {
                // move right
                start = mid + 1;
            }
        }
        System.out.println("Correct position of " + x + " = " + index);
    }
}
