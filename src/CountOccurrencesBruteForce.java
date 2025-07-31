import java.util.Arrays;
import java.util.Scanner;

public class CountOccurrencesBruteForce {
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
        CountOccurrencesBruteForce obj = new CountOccurrencesBruteForce();
        int result = obj.occurrences(arr, val);
        System.out.println("Occurrences of " + val + " = " + result);
    }

    public int occurrences(int[] arr, int x){
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++){
            if (x == arr[i]){
                count++;
            }
        }

        return count;
    }
}
