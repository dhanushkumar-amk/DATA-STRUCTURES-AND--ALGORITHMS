public class RightShiftOperator {
    public static void main(String[] args) {
          int x=-2147483648;//10000000000000000000000000000000
        System.out.println(x^2);  //10000000000000000000000000000000    ans =2147483646
                                  //00000000000000000000000000000010
                                 // 10000000000000000000000000000010

        System.out.println(x|2);//10000000000000000000000000000000
        //////////////////////////
        System.out.println(x&22);//
        System.out.println(x>>2);//

    }
}
