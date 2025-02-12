class Solution {
    public String destCity(List<List<String>> paths) {


        Set <String> st= new HashSet<>();

        for(List<String> path : paths){
            String source= path.get(0);
            st.add(source);
        }

        for(List<String> path : paths){

           String des= path.get(1);

           if(!st.contains(des)){
            return des;
           }
        }
          return "";
    }
  
}