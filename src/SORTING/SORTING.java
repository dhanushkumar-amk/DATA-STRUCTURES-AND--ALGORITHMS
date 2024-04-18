package SORTING;
class  SORTING {
    public static void main(String[] args) {
        int [] arr ={23,432,5,42};
        int n= arr.length;
        for (int i=0; i<n-1; i++)
        {
            for (int j=0; j<n-1-i;j++)
            {
                if(arr[j]>arr[i])
                {
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for (int x:arr) System.out.print(x+" ");
    }
}
