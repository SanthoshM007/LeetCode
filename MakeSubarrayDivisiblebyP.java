class Solution {
    public int minSubarray(int[] nums, int p) {
        int n = nums.length;
        long totalSum = 0;

        // Calculate the total sum of the array
        for (int num : nums) {
            totalSum += num;
        }

        // If totalSum is already divisible by p, no need to remove any subarray
        long targetMod = totalSum % p;
        if (targetMod == 0) return 0;

        // Use a hashmap to store the prefix sum mod and its index
        Map<Long, Integer> prefixModMap = new HashMap<>();
        prefixModMap.put(0L, -1); // To handle cases where the valid subarray starts from index 0
        long prefixSum = 0;
        int minLen = n;

        for (int i = 0; i < n; i++) {
            prefixSum += nums[i];
            long currentMod = prefixSum % p;
            long neededMod = (currentMod - targetMod + p) % p;

            if (prefixModMap.containsKey(neededMod)) {
                minLen = Math.min(minLen, i - prefixModMap.get(neededMod));
            }

            prefixModMap.put(currentMod, i);
        }

        return minLen == n ? -1 : minLen;
    }
}
