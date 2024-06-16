class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
         

    int ans =words.length;
       
     Set<Character>hash_set= new HashSet<>();
     for(int i=0 ; i<allowed.length(); i++){
        hash_set.add(allowed.charAt(i));
       }


     for(String s:words ){
         for(int i=0; i<s.length(); i++){
                 
                   if(!hash_set.contains(s.charAt(i))){
                       
                       ans--;
                       break;
                   
                      }
              
              }

        }
     return ans;


   
        
    }
}