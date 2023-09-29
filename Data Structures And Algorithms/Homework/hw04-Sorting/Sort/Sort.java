import java.util.*;

public class Sort {
    // selection sort
    public static void selectionSort(int[] a) {
        int n = a.length;

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;

            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIdx]) {
                    minIdx = j;
                }
            }

            int temp = a[minIdx];
            a[minIdx] = a[i];
            a[i] = temp;

            System.out.println(Arrays.toString(a));
        }
    }

    public static void selectionSort(int[] a, boolean reversed) {
        // TODO
    }

    // bubble Sort
    public static void bubbleSort(int[] a) {
        int n = a.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            // System.out.println(Arrays.toString(a));
        }
    }

    public static void bubbleSort(int[] a, boolean reversed) {
        // TODO
    }

    // insertion Sort
    public static void insertionSort(int[] a) {
        int n = a.length;

        for (int i = 1; i < n; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
            System.out.println(Arrays.toString(a));
        }
    }

    public static void insertionSort(int[] a, boolean reversed) {
        // TODO
    }
}