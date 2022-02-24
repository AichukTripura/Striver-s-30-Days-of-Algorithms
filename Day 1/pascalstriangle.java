//Given an integer numRows, return the first numRows of Pascal's triangle.

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        res.get(0).add(1);
        int height = 1;
        for (int row = 1; row < numRows; row++) {
            height++;
            res.add(new ArrayList<>());
            for (int n = 0; n < height; n++) {
                if (n == 0 || n == height - 1) {
                    res.get(row).add(1);
                } else {
                    int sum = res.get(row - 1).get(n - 1) + res.get(row - 1).get(n);
                    res.get(row).add(sum);
                }
            }
        }

        return res;
    }
}