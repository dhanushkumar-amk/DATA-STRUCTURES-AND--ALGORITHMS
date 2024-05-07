package SORTING;

import java.util.Arrays;
import java.util.Comparator;

public  class NmeetingINOneRoom  {
    static class  meetings {
        int start;
        int end;
        meetings(int start,int end) {
            this.start=start;
            this.end=end;
        }
    }
    static int maxMeetings(int [] start ,int [] end ,int n) {
        meetings [] meetingsList = new meetings[n];
        for (int i=0;i<n; i++)
        {
            meetingsList[i]=new meetings(start[i],end[i]);
        }
        Arrays.sort(meetingsList, Comparator.comparing((a)->a.end));
    }
    public static void main(String[] args) {
        int [] start=  {1,3,0,5,8,5};
        int [] end  = {2,4,6,7,9,9};
        int n=start.length;
       int res= maxMeetings(start,end,n);
        System.out.println(res);
    }
}