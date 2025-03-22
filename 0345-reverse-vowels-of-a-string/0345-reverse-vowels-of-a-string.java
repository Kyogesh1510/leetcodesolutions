class Solution {


      public static boolean isVowel(char ch){

              if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'||
                   ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                    return true;
                   }

           return false;
      }


    public String reverseVowels(String s) {

        char[] arr=s.toCharArray();


        int i=0;
        int j=arr.length-1;


        while(i < j){
            if ( !isVowel(arr[i]) ){
                i++;
            }else if ( !isVowel( arr[j]) ){
               j--;
            }else{          
                    char ch=arr[i];
                    arr[i]=arr[j];
                    arr[j]=ch;
                    i++;
                    j--;
            }
        }

         return new String (arr);
        
    }
}