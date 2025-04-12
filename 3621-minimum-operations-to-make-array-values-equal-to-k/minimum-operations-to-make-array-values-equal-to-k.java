class Solution {
    public int minOperations(int[] nums, int k) {

        Set<Integer> set= new HashSet<>();


        for (int i=0 ; i<nums.length ; i++){

            if (nums[i]<k ){
                return -1;
            }else if (nums[i] > k){
                set.add(nums[i]);
            }
        }
        
        return set.size();
    }
}