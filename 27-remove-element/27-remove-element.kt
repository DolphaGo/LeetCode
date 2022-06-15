class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var count = 0
        for (i in nums.indices) {
            if (nums[i] != `val`) {
                nums[count++] = nums[i]
            }
        }
        return count
    }
}