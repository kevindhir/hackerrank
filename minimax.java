import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//https://www.hackerrank.com/challenges/mini-max-sum/problem

public class Solution {
    private static long[] miniMaxSum(long[] longs){
        Arrays.sort(longs);
        long min = longs[0] + longs[1] + longs[2] + longs[3];
        long max = longs[1] + longs[2] + longs[3] + longs[4];
        long[] returnArray = {min, max};
        return returnArray;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] arr = new long[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextLong();
        }
        long[] out = miniMaxSum(arr);
        System.out.println(out[0] + " " + out[1]);
    }
}
