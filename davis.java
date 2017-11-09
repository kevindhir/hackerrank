//https://www.hackerrank.com/challenges/ctci-recursive-staircase/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static HashMap<Integer, Integer> davisMap;
    
    private static int getDavisNumber(int n){
        if(n < 0){
            return 0;
        }
        if(davisMap.get(n) != null){
            return davisMap.get(n);
        } else {
            int davisN = getDavisNumber(n-1) + getDavisNumber(n-2) + getDavisNumber(n-3);
            davisMap.put(n, davisN);
            return davisN;
        }
    }

    
    
    public static void main(String[] args) {
        davisMap = new HashMap<Integer, Integer>();
        davisMap.put(0, 1);
        davisMap.put(1, 1);
        davisMap.put(2, 2);
        davisMap.put(3, 4);
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        for(int a0 = 0; a0 < s; a0++){
            int n = in.nextInt();
            int davisNumber = getDavisNumber(n);
            System.out.println(davisNumber);
        }
    }
}
