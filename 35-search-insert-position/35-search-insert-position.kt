class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        val result = nums.binarySearch(target, 0, nums.size)
        return if (result < 0) result.times(-1).minus(1) else result
    }
}