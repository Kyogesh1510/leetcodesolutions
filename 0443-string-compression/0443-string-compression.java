class Solution {
    public int compress(char[] chars) {


        int n=chars.length;

        int i=0;
        int index=0;

        while (i<n){

            char curr=chars[i];

            int count=0;

            while( i<n && curr==chars[i]){
                i++;
                count++;
            }

            chars[index]=curr;
            index++;


            if (count>1){
               String str= Integer.toString(count);
                       for (char ch : str.toCharArray()){
                        chars[index]=ch;
                        index++;
                       }
            }


        }
                return index;

    }
}