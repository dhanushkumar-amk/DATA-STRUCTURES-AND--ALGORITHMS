package RECURSION;

 class ProgramForFactorialOfANumberUsingRecursion {
     static int  factorialNumber(int n) {
         if (n==1)
             return 1;
         return n*factorialNumber(n-1);
     }
     public static void main(String[] args) {
         int n=6;
        int res= factorialNumber(6);
         System.out.println(res);

     }
}
