class Solution {
    fun addBinary(a: String, b: String): String {
        val targetStr = StringBuilder()
        var ai = a.lastIndex
        var bi = b.lastIndex
        var sum = 0
        while (ai >= 0 || bi >= 0) {
            if (ai >= 0) sum += a[ai--] - '0'
            if (bi >= 0) sum += b[bi--] - '0'
            targetStr.append(sum % 2)
            sum /= 2
        }
        if (sum != 0) {
            targetStr.append(sum)
        }
        return targetStr.toString().reversed()
    }
}
