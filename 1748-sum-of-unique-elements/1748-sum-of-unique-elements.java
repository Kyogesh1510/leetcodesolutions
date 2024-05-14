class Solution {
    public int sumOfUnique(int[] nums) {
     int[] temp=new int[101];
     

    for(int i=0; i<nums.length;  i++){
     temp[nums[i]]+=1;
    }

    int sum=0;
  for(int i=0;  i < temp.length; i++){
  
    if(temp[i]==1){
       sum+=i;
   }


    }


    return  sum;


   }
}