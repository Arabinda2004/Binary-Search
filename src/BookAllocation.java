import java.util.Scanner;
import java.util.Arrays;

public class BookAllocation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] books = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print("Enter value " + (i+1) + ": ");
            int value = sc.nextInt();
            books[i] = value;
        }
        System.out.println("Books array: " + Arrays.toString(books));
        int ans = 0;
        System.out.print("Enter number of students: ");
        int M = sc.nextInt();
        int start = maximum(books);
//        System.out.println(start);
        int end = sumOfElement(books);
//        System.out.println(end);

        while (start <= end){
            int mid = start + (end - start) / 2;
            int page = 0, count = 1;
            for (int val: books){
                page += val;
                if (page > mid){
                    count++;
                    page = val;
                }
            }
            if (count <= M){
                ans = mid;
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        System.out.println(ans);
        sc.close();
    }

    public static int maximum(int[] arr){
        int result = arr[0];
        for (int val: arr){
            if (val > result){
                result = val;
            }
        }
        return result;
    }

    public static int sumOfElement(int[] arr){
        int sum = 0;
        for (int val: arr){
            sum += val;
        }
        return sum;
    }
}
