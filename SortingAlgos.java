public class SortingAlgos {

    // Time Complexity: Best Case O(n), Average/Worst Cases O(n*n)
    // In Place Sorting
    public static void bubbleSort(int[] arr) {
        int size = arr.length;
        int temp;
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < size - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // Time Complexity: O(n*n) in all cases as there are 2 nested loops
    // In place Sorting
    public static void selectionSort(int[] arr) {
        int size = arr.length;
        int temp;
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++)
                if (arr[j] < arr[minIndex])
                    minIndex = j;

            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Time Complexity: Best Case O(n), Average/Worst Cases O(n*n)
    // In Place Sorting
    public static void insertionSort(int arr[]) {
        int size = arr.length;
        int key, j;
        for (int i = 1; i < size; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }


    public static void main(String[] args) {
        int arr[] = {-20, 3, -6, 60, 35, 2, -13, 45, 320, 5};
        int size = arr.length;

        System.out.println("Array Before Sorting");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //bubbleSort(arr);
        //selectionSort(arr);
        //insertionSort(arr);

        System.out.println("Array After Sorting");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

