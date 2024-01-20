public class selection_short {

    
    static void selectionSort(int arr[]) {
        int n = arr.length;

        
        for (int i = 0; i < n - 1; i++) {
           
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String args[]) {
        int arr[] = { 64, 25, 12, 22, 11 };
        int n = arr.length;

        System.out.println("Array before sorting:");
        printArray(arr);

        selectionSort(arr);

        System.out.println("Array after sorting:");
        printArray(arr);
    }

    
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
