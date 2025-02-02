class Solution {
    public int minLength(String s) {


        Stack<Character> st = new Stack<>();

        for(int i=0 ; i<s.length() ; i++){

            char current=s.charAt(i);


            if(st.isEmpty()){
                st.push(current);
                continue;
            }


            if(current =='B' && st.peek() == 'A'){
                st.pop();
            }else if (current=='D' && st.peek() == 'C'){
                st.pop();
            }else{
                st.push(current);
            }

        } 


      return st.size();

        
    }
}