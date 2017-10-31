//Used memoization, managed to get it working on the first try. Here's that code.

import java.util.*;

public class Solution {    
    public static int fibonacci(int n) {
        int[] calculated = new int[n+1];
        calculated[0] = 0;
        calculated[1] = 1;
        return fibHelper(n, calculated);
    }
    
    private static int fibHelper(int n, int[] calculated){
        if(n == 0){
            return 0;
        }
        if(calculated[n] != 0){
            return calculated[n];
        }
        int fibN = fibHelper((n-1), calculated) + fibHelper((n-2), calculated);
        calculated[n] = fibN;
        return fibN;
    }
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}
