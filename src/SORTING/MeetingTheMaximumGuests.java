package SORTING;

import java.util.Arrays;

public class MeetingTheMaximumGuests {
  static int   MeetingMax(int [] start,int []end ,int n){
      Arrays.sort(start);
      Arrays.sort(end);
      
    }
    public static void main(String[] args) {
        int [] start = {900,700,900};
        int [] end   = {1000,800,730};
         int res= MeetingMax(start,end,start.length);
        System.out.println(res);
    }
}