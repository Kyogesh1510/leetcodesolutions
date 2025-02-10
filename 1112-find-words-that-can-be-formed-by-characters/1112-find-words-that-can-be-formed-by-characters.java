class Solution {
    public int countCharacters(String[] words, String chars) {
        int [] charCount= new int[26];

        for (char ch : chars.toCharArray()){
            charCount[ch-'a']++;
        }

        int result=0;

        for(String word: words){
            int [] wordCount= new int[26];
            for(char ch : word.toCharArray()){
                wordCount[ch-'a']++;
            }

            if (canForm(wordCount, charCount)) {
                result += word.length();
            }
        }
        return result;
    }

     private boolean canForm(int[] wordCount, int[] charCount) {
        for (int i = 0; i < 26; i++) {
            if (wordCount[i] > charCount[i]) return false;
        }
        return true;
    }
}