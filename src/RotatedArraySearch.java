import java.util.Scanner;

public class RotatedArraySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {4, 5, 6, 7, 1, 2, 3};
        int n = arr.length;
        int start = 0, end = n - 1;
        int index = -1;
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == x){
                index = mid;
                break;
            } else if (arr[mid] >= arr[0]) {
                // array is sorted in left side
                if (arr[0] <= x && x <= arr[mid]){
                    // move left
                    System.out.println("Moving left");
                    end = mid - 1;
                }
                else {
                    // move right
                    System.out.println("Moving right");
                    start = mid + 1;
                }
            }
            else {
                // array is sorted in right
                if (arr[mid] <= x && x <= arr[n-1]){
                    // move right
                    System.out.println("Moving right");
                    start = mid + 1;
                }
                else {
                    // move left
                    System.out.println("Moving left");
                    end = mid - 1;
                }
            }
        }
        if (index != -1){
            System.out.println("Element found at index: " + index);
        }
        else {
            System.out.println("Not found!");
        }
    }
}
