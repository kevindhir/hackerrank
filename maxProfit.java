import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 
 
 Given an array of stock prices for one stock
 Find the most profitable buy and sell point
 Return highest profit
 
 [2, 3, 1, 6] -> returns 5
 
 Most profitable buy and sell is 1 and 6
 
 
 */

// [-10, 1, 5, 10, 40] max profit = 50
// [0, -5, 50, 35, 30] max profit = 55
// [2, -10, 0] max profit = 10
// [-10, -11, -12];

class Solution {
  
  private static int maxProfit(int[] history){
    if(history.length == 0) return 0;
    int maxProfit = history[1] - history[0];
    int lo = history[0];
    int highestIndex = 1;
    
    for(int i = 0; i < history.length - 1; i++){
      if(history[i] < lo){
        if(i+1 < highestIndex){
          maxProfit = history[highestIndex] - history[i];
        } else{
          int highest = history[i+1];
          highestIndex = i+1;
          for(int j = i+1; j < history.length; j++){
            if(history[j] > highest){
              highest = history[j];
              highestIndex = j;
            }
          }
          maxProfit = highest - history[i];
        }
     
    }
    }
    
    return maxProfit;
  }
  
  private static int onceProfit(int[] history){
    int buy = history[0]; //lowest buying price
    int maxProfit = 0; //highest local max profit
    
    for(int i = 1; i < history.length; i++){
      int current = history[i];
      
      if(current < buy){
        buy = current;
        continue;
      }
      
      int profit = current - buy;
      
      if(profit > maxProfit){
        maxProfit = profit; 
      }
      
    }
    
    return maxProfit;
    
    
  }
  
  public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<String>();
    strings.add("Hello, World!");
    strings.add("Welcome to CoderPad.");
    strings.add("This pad is running Java 8.");

    int[] input = new int[]{-10, -11, -12};
    int output = onceProfit(input);
    System.out.println(output);
    
  }
}
