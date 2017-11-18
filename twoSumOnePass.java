//proud because I got it optimized on my first attempt

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> complements = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(complements.containsKey(complement)){
                int complementIndex = complements.get(complement);
                int[] solution = new int[2];
                solution[1] = complementIndex;
                solution[0] = i;
                return solution;
            } else complements.put(nums[i], i);
        }
        return new int[]{};
    }
}
