//http://www.geeksforgeeks.org/inplace-rotate-square-matrix-by-90-degrees/
class Solution {
  private static int[][] rotateNinety(int[][] input){
    int n = input.length;
    int[][] output = new int[n][n];
    
    
    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        int value = input[i][j];
        output[n-1-j][i] = value;
      }  
    }

    
    return output;
  }
  
  
  public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<String>();
    strings.add("Hello, World!");
    strings.add("Welcome to CoderPad.");
    strings.add("This pad is running Java 8.");
    int n = 3;
    int[] line1 = new int[]{1, 2, 3};
    int[] line2 = new int[]{4, 5, 6};
    int[] line3 = new int[]{7, 8, 9};
    int[][] input = new int[][]{ line1, line2, line3 };
    int[][] output = rotateNinety(input);
    
    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        System.out.println("i: " + i + " j:" + j + " = " + output[i][j]);
      }
    }
  }
  
}
