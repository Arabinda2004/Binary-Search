import java.util.Arrays;
import java.util.Scanner;

public class PainterPartition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of walls: ");
        int n = sc.nextInt();
        int[] walls = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print("Enter height of wall " + (i+1) + ": ");
            int value = sc.nextInt();
            walls[i] = value;
        }
        System.out.println("Walls array: " + Arrays.toString(walls));

        System.out.println("Enter number of workers: ");
        int k = sc.nextInt();

        int start = walls[0], end = 0, mid, ans = -1;
        for (int value: walls){
            end += value;
            if (value > start){
                start = value;
            }
        }

        while (start <= end){
            mid = start + (end - start) / 2;
            int wallHeight = 0, count = 1;
            for (int value: walls){
                wallHeight += value;
                if (wallHeight > mid){
                    count++;
                    wallHeight = value;
                }
            }
            if (count <= k){
                ans = mid;
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        System.out.println("Minimum time required: " + ans);
    }
}
