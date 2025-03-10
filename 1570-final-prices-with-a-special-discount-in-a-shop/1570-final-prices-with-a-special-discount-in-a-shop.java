class Solution {
    public int[] finalPrices(int[] prices) {

        int n=prices.length;
        int [] res= new int[n];

        for (int i=0 ; i<n ; i++){
            res[i] = prices[i]; // Default value is the original price

            for (int j=i+1 ;  j<n ; j++){
                   if(  prices[j] <= prices[i]){
                       res[i]= prices[i]-prices[j];
                       break;
                   }
            }
        }
        return res;
    }
}