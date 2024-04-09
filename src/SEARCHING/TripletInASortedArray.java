package SEARCHING;
public class TripletInASortedArray {
    public static void main(String[] args) {
        int [] arr = {1,3,4,6,9,12};
        int n= arr.length;
        int left=0;
        int center=1;
        int right=n-1;
        int sum=25;
        while(left<right){
            while(center<right){
                if (arr[left]+arr[center]+arr[right]==sum)
                {
                    System.out.println(arr[left]+" "+arr[center]+" "+arr[right]);
                    break;
                }
                center++;
            }
            if(center==right)
            {
                left+=1;
                center=left+1;
            }
            left++;
        }
    }
}
