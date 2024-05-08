package SORTING;

public class CyclicSort {
    public static void main(String[] args) throws Exception {
        int [] arr ={40,30,20,10};
        int n= arr.length;
        for (int i=0; i<n; i++)
        {
            int ele=arr[i];
            int count=0;
            for (int j=0; j<n;j++)
            {
                if(ele<arr[j])
                    count++;
            }
        }

    }
}
