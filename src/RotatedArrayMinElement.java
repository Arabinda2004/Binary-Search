public class RotatedArrayMinElement {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 2, 3};
        int start = 0, end = arr.length - 1;
        int result = arr[0];
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] >= arr[0]){
                // array is sorted from left side, move to right side
                start = mid + 1;
            }
            else { // array[mid] < array[0]
                // array is sorted from right side, move to left side
                result = arr[mid]; // potential solution
                end = mid - 1;
            }
        }
        System.out.println(result);
    }
}
