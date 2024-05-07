package SORTING;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Solution {
    static class Meetings {
        int start;
        int end;

        Meetings(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static ArrayList<Integer> maxMeetings(int n, int[] start, int[] end) {
        Meetings[] meetingsList = new Meetings[n];
        for (int i = 0; i < n; i++) {
            meetingsList[i] = new Meetings(start[i], end[i]);
        }

        // Sort meetings based on end times
        Arrays.sort(meetingsList, Comparator.comparing((a) -> a.end));

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); // Add the first meeting as it's always accommodated
        int ends = meetingsList[0].end;

        // Iterate through the sorted meetings
        for (int i = 1; i < n; i++) {
            if (meetingsList[i].start > ends) {
                list.add(i + 1); // Add i + 1 to indicate the 1-based index
                ends = meetingsList[i].end;
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int[] start = {12, 6, 16, 12, 6, 9, 16, 6, 17, 5};
        int[] end = {17, 13, 16, 18, 17, 10, 18, 12, 18, 11};
        ArrayList<Integer> result = maxMeetings(10, start, end);

        // Print the result
        System.out.println("Output: ");
        for (int meeting : result) {
            System.out.print(meeting + " ");
        }
    }
}
