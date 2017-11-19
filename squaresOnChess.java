//Squares on an N*N Chessboard

class Solution {
  
  //counting squares with a for loop
  //
    
  //private static int countSquares(int n){
  //  int output = 0;
  //  for(int i = n; n > 0; n--){
  //     output += n*n;
  // }
  // return output;
  //}
  
  
  private static int countSquares(int n, HashMap<Integer, Integer> map){
    if(n < 0){
      return 0;
    }
    
    if(map.containsKey(n)){
      return map.get(n);
    } 
  
    int nSquare = n*n;
    int subProblems = countSquares(n-1, map);
    int currentOut = nSquare + subProblems;
    map.put(n, currentOut);
    return currentOut;    
  }
  
  
  public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<String>();
    strings.add("Hello, World!");
    strings.add("Welcome to CoderPad.");
    strings.add("This pad is running Java 8.");
    HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
    hashMap.put(0, 0);
    hashMap.put(1, 1);
    hashMap.put(2, 5);
    int output = countSquares(8, hashMap);
    System.out.println(output);
    
  }
  
}
