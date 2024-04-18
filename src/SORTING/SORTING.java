package SORTING;
class  SORTING {
    public static void main(String[] args) {
        int [] arr ={7,3,5,9,2};
        int n= arr.length;
        for (int i=0; i<n; i++)
        {
            for (int j=i+1;j<n; j++ )
            {
                if(j==n-1)
                    n--;
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int temp:arr)
            System.out.print(temp );
    }
}
