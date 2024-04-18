package SORTING;
class  SORTING {
    public static void main(String[] args) {
        int [] arr ={23,432,5,42};
        int n= arr.length;
        for (int i=0; i<n-2; i++)
        {
            for (int j=0; j<n-i-1;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int x:arr) System.out.print(x+" ");
    }
}
