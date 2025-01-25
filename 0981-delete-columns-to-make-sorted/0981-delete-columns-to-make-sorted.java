class Solution {
    public int minDeletionSize(String[] strs) {
        int n = strs.length;      // Number of rows
        int m = strs[0].length(); // Number of columns

        int count = 0;

        // Iterate over columns
        for (int i = 0; i < m; i++) {
            // Check each column for non-decreasing order
            for (int j = 1; j < n; j++) {
                if (strs[j].charAt(i) < strs[j - 1].charAt(i)) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }
}
