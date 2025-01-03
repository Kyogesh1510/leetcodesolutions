class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        // Concatenate elements of word1
        for (int i = 0; i < word1.length; i++) {
            str1.append(word1[i]);
        }

        // Concatenate elements of word2
        for (int i = 0; i < word2.length; i++) {
            str2.append(word2[i]);
        }

        // Compare the string representations
        return str1.toString().equals(str2.toString());
    }
}
