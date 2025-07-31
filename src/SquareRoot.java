import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int start = 1;
        int end = a;
        int result = 0;
//        if (x < 2){
//            return x;
//        }
        while (start <= end){
//            System.out.println("Into the loop");
            int mid = start + (end - start) / 2;
//            int square = mid * mid; // integer overflow
            if (mid == a/mid){
                result = mid;
                break;
            } else if (mid > a/mid) {
                // move left
//                result = mid;
                end = mid - 1;
            }
            else { // when target is greater than square "mid" value can be a potential answer
                // move right
                result = mid;
                start = mid + 1;
            }
        }
        System.out.println(result);
        sc.close();
    }
}
