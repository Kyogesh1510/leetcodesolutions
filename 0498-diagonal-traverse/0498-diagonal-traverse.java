import java.util.*;

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        
        // Fill the map using [i + j]
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!map.containsKey(i + j)) {
                    map.put(i + j, new ArrayList<>());
                }
                map.get(i + j).add(mat[i][j]);
            }
        }
        
        boolean flip = true;
        for (int key : map.keySet()) {
            List<Integer> values = map.get(key);
            
            if (flip) {
                Collections.reverse(values);
            }
            
            result.addAll(values);
            flip = !flip;
        }
        
        int[] output = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            output[i] = result.get(i);
        }
        
        return output;
    }
}
