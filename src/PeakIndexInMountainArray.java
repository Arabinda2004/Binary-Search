public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {2, 34, 27, 10, 12, 8, 5};
        int start = 0, end = arr.length - 1;
        int index = -1;
        while (start <= end){
//            int mid = start + (end - start) / 2;
            int mid = end + (start - end) / 2;
            if (arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                index = mid;
                break;
            } else if (arr[mid] > arr[mid-1]) {
                // move right
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        System.out.println(index);
    }
}
