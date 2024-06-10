class Solution {
    public boolean checkIfPangram(String sentence) {
        Set set = new HashSet<>();
        for(char c : sentence.toCharArray()) {   set.add(c);}
        return set.size() == 26;
    }
}