package SORTING;

class Solution
{
    public static void main (String[] args)
    {
        int arr[] = { 532,8,3,234,5,8};
        int n = arr.length;
        cycleSort(arr, n);

        for (int i = 0; i < n; i++)
            System.out.print( arr[i] + " ");

    }

    static void cycleSort(int arr[], int n) {
        for (int cs = 0; cs < n - 1; cs++) {
            int item = arr[cs];
            int pos = cs;
            for (int i = cs + 1; i < n; i++)
                if (arr[i] < item)
                    pos++;

            if (pos == cs) // Skip if the current element is already at its correct position
                continue;

            // Handle duplicate elements
            while (item == arr[pos])
                pos++;

            if (pos != cs) {
                int temp = item;
                item = arr[pos];
                arr[pos] = temp;
            }

            while (pos != cs) {
                pos = cs;
                for (int i = cs + 1; i < n; i++)
                    if (arr[i] < item)
                        pos++;

                while (item == arr[pos])
                    pos++;

                if (item != arr[pos]) {
                    int temp = item;
                    item = arr[pos];
                    arr[pos] = temp;
                }
            }
        }
    }

}

