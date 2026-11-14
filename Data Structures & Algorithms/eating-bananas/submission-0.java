class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();
        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canFinish(piles, h, mid)) {
                ans = mid;         // Try a slower speed
                high = mid - 1;
            } else {
                low = mid + 1;     // Need a faster speed
            }
        }
        return ans;
        
    }

    private boolean canFinish(int[] piles, int h, int speed) {
        long totalHours = 0;
        for (int pile : piles) {
            // Equivalent to Math.ceil((double) pile / speed) without float division
            totalHours += (pile + speed - 1) / speed;
        }
        return totalHours <= h;
    }
}
