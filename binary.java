public class binary {


    static int binarySearch(int arr[], int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            
            if (arr[mid] == target)
                return mid;

            
            if (arr[mid] < target)
                left = mid + 1;

            
            else
                right = mid - 1;
        }

        
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 5, 8, 12, 16, 23, 38, 42, 50 };
        int target = 23;

        int result = binarySearch(arr, target);

        if (result == -1)
            System.out.println("Element not present in the array");
        else
            System.out.println("Element found at index " + result);
    }
}
