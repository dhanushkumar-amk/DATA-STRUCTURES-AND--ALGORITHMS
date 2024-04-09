package SEARCHING;
public class TripletInASortedArray {
    public static void main(String[] args) {
        int [] arr = {2,3,4,8,9,20,40};
        int n= arr.length;
        int left=0;
        int center=1;
        int right=n-1;
        int sum=32;
        while(left<center){
            while(center<right){
                if (arr[left]+arr[center]+arr[right]==sum)
            }
            if(center==right)
            {
                left+=1;
                center=left+1;
            }
        }
    }
}
