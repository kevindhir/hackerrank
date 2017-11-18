https://leetcode.com/problems/sort-colors/description/

class Solution {
    public void sortColors(int[] nums) {
        if(nums.length == 0){
            return;
        }
        int numRed = 0;
        int numWhite = 0;
        int numBlue = 0;
        for(int i = 0; i < nums.length; i++){
            switch(nums[i]){
                case 0: 
                    numRed++;
                    break;
                case 1:
                    numWhite++;
                    break;
                case 2: 
                    numBlue++;
                    break;
                default:
                    //error handle here, unsupported color 
                    return;
            }
        }
        int j = 0;
        while(numRed > 0){
            nums[j] = 0;
            numRed--;
            j++;
        }
        while(numWhite > 0){
            nums[j] = 1;
            numWhite--;
            j++;
        }
        while(numBlue > 0){
            nums[j] = 2;
            numBlue--;
            j++;
        }
    }
}
