package SORTING;
public  class NmeetingINOneRoom  {
    static int maxMeetings(int [] start ,int [] end ,int n) {

    }
    public static void main(String[] args) {
        int [] start=  {1,3,0,5,8,5};
        int [] end  = {2,4,6,7,9,9};
        int n=start.length;
       int res= maxMeetings(start,end,n);
        System.out.println(res);
    }
}