package SORTING;

public class ShellSort {
    private static void swap(int[] first, int[] second, int l, int r) {
        int temp = first[l];
        first[l] = second[r];
        second[r] = temp;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {0, 2, 6, 8, 9};
        int len1 = arr1.length;
        int len2 = arr2.length;
        int len = len1 + len2;

        // Calculate initial gap
        int gap = len / 2;

        while (gap > 0) {
            for (int i = gap; i < len; i++) {
                int temp;
                if (i < len1) {
                    for (int j = i - gap; j >= 0 && arr1[j] > arr1[j + gap]; j -= gap) {
                        swap(arr1, arr1, j, j + gap);
                    }
                } else {
                    temp = i - len1;
                    for (int j = temp - gap; j >= 0 && arr2[j] > arr2[j + gap]; j -= gap) {
                        swap(arr2, arr2, j, j + gap);
                    }
                }
            }
            // Reduce the gap
            gap = gap / 2;
            if (gap % 2 == 1 && gap > 1) {
                gap++; // Make sure gap is always even except for the last iteration
            }
        }

        // Print sorted arrays
        System.out.println("Sorted arr1:");
        for (int num : arr1) { 
            System.out.print(num + " ");
        }
        System.out.println("\nSorted arr2:");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
    }
}
