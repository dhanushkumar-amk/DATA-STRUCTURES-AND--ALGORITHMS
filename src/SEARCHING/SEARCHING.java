package SEARCHING;

public class SEARCHING {
    // Pair Class
    static class Pair{
        long x;
        long y;

        Pair(long x, long y){
            this.x = x;
            this.y = y;
        }
    }
    //Function to find repeated element and its frequency.
    public static Pair findRepeating(Long arr[],int n)
    {


//User function Template for Java

        class Solution
        {
            // Pair Class
            static class Pair{
                long x;
                long y;

                Pair(long x, long y){
                    this.x = x;
                    this.y = y;
                }
            }
            //Function to find repeated element and its frequency.
            public static Pair findRepeating(Long arr[], int n) {
                for (int i = 0; i < n - 1; i++) {
                    // If current element is equal to next element, it is the repeating element
                    if (arr[i].equals(arr[i + 1])) {
                        // Count the frequency of the repeating element
                        int frequency = 1;
                        int j = i + 1;
                        while (j < n && arr[i].equals(arr[j])) {
                            frequency++;
                            j++;
                        }
                        return new Pair(arr[i], frequency);
                    }
                }
                // If no repeating element found, return {-1, -1}
                return new Pair(-1, -1);
            }
        };
    }

    public static void main(String[] args) {

    }
}
