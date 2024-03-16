package ARRAYS;
 class MaximumCircularSumSubArray {
     static int MaxiMumCircularSumSubArrays(int[] arr, int n) {
         int max = Integer.MIN_VALUE;
         int min = Integer.MAX_VALUE;
         int Totalsum = 0;
         int currMax = 0;
         int currMin = 0;
         for (int x : arr) {
             Totalsum += x;

             currMax += x;
             if (currMax > max) max = currMax;
             if (currMax < 0) currMax = 0;

             currMin += x;
             if (currMin < 0) min = currMin;
             if (currMin > 0) currMin = 0;
         }
         System.out.println(max);
         System.out.println(Totalsum-min);
         if (max < 0) return max;
         return Math.max(max, Totalsum - min);
     }

     public static void main(String[] args) {
         int[] arr = {10, -3, -4, 7, 6, 5, -4, -1};
         int n = arr.length;
         int result = MaxiMumCircularSumSubArrays(arr, n);
         System.out.println(result);
     }
 }