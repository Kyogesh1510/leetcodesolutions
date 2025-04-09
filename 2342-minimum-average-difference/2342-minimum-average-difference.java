class Solution {
    public int minimumAverageDifference(int[] nums) {


        int n=nums.length;

        long sum=0;


        for (int i=0 ; i< n ; i++){
            sum +=nums[i];
        }

        long leftSum=0;
        long rightSum=0;



        int result=Integer.MAX_VALUE;
        int index=-1;


        for (int i=0 ; i< n ; i++){
           leftSum += nums[i];
            rightSum = sum - leftSum;

            int leftCount=i+1;
            int rightCount=n-leftCount;


            long leftAvg=leftSum/leftCount;
            long rightAvg=(i == n-1) ? 0 : rightSum/rightCount;



            int diff= (int)Math.abs(leftAvg-rightAvg);


            if(diff<result){
                result=diff;
                index=i;
            }

        }
        return index;

    }
}