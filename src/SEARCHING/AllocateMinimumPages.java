package SEARCHING;

public class AllocateMinimumPages {
//    static int recursive(int [] arr,int n,int student){
//return 1;
//    }
    public static void main(String[] args) {
        int [] arr ={12,34,67,90,12,43,5,46,2342,543,2,342};


        int left=0;
        int leftMid= (arr.length/2)-1;
        int rightMid=( arr.length/2);
        int right= arr.length-1;
        int sum=0;
      if(arr.length>=4) while(left<leftMid && right>rightMid)
       {
           sum+=arr[left++]+arr[leftMid--]+arr[right--]+arr[rightMid++];
       }
      else while(left<right){
          sum+=arr[left++]+arr[right--];
      }
        System.out.println(sum);
    }
}
