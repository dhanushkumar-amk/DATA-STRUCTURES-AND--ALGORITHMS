package ARRAYS;
public class EquilibriumPoint {
    public static void main(String[] args) {
        int []arr  ={5,2,2,4,3,4,2};
       int sum=0;
       for (int i=0; i< arr.length; i++)
       {
           sum+=arr[i];
       }
       int sum2=0;
       for (int i= arr.length-1; i>=0; i--)
       {
           sum2+=arr[i];
           sum=sum-arr[i];
           if(sum2==sum) {
               System.out.println(i);
               break;
           }
       }
    }
}
