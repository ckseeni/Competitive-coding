public class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int N = nums.length;
        int[][] max = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                max[i][j] = Integer.MIN_VALUE;
            }
        }
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        int i = helper(nums, 0, N - 1, sum, max);
        return i >= sum - i;
    }
    private int helper(int[] nums, int lo, int hi, int sum, int[][] max) {
        if (lo > hi) {
            return 0;
        }
        if (lo == hi) {
            return nums[lo];
        }
        if (max[lo][hi] >= 0) {
            return max[lo][hi];
        }
        max[lo][hi] = Math.max(sum - helper(nums, lo + 1, hi, sum - nums[lo], max), sum - helper(nums, lo, hi - 1, sum - nums[hi], max));
        return max[lo][hi];
    }
