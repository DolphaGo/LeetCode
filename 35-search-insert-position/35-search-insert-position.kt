class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var s = 0
        var e = nums.size
        while (s < e) {
            val mid = (s + e).shr(1)
            if (nums[mid] < target) s = mid + 1 else e = mid
        }
        return e
    }
}