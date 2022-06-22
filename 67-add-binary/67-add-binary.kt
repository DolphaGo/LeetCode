class Solution {
    fun addBinary(a: String, b: String): String {
        return a.toBigInteger(2).add(b.toBigInteger(2)).toString(2)
    }
}
