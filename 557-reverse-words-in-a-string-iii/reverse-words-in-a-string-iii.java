class Solution {
    public String reverseWords(String s) {




        String words[]=s.split(" ");

        StringBuilder result= new StringBuilder();

        for (String word :  words){

            StringBuilder reverseWord= new StringBuilder(word).reverse();

            result.append(reverseWord).append(" ");

        }
             
             return  result.toString().trim();
 
    }             

}