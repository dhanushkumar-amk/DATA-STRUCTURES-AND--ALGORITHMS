package SORTING;
public class ShellSort {
    public static void main(String[] args) {
        int [] arr= {50,40,30,20,10,5,2,1};
        int gap= arr.length-1/2;
        for (int i=0; i<=gap; i=gap/2)
        {
            for (int j=i;j<=i; j++)
            {
                if(arr[j]>arr[j+i])
                {
                    int temp=arr[j];
                }
            }
        }
    }
}
