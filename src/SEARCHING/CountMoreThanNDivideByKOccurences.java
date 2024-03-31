package SEARCHING;

import INTERVAL_TREE.INTERVAL_TREE;

import java.util.HashMap;

public class CountMoreThanNDivideByKOccurences {
    public static void main(String[] args) {
        HashMap<Integer, Integer> integerHashMap = new HashMap<>();
        int[] arr = {3, 1, 2, 2, 1, 2, 3, 3};
        int n = arr.length;
        int k = 4;
        for (int i = 0; i < n; i++) {
            integerHashMap.put(i, integerHashMap.getOrDefault(i, 0) + 1);
        }
        int c = 0;
        for (int key : integerHashMap.keySet()) {
            if (integerHashMap.get(key) > n / k)
                c++;
        }
        System.out.println(c);
    }
}
