class Solution {
    fun convertToTitle(columnNumber: Int): String {
        val builder = StringBuilder()
        var number = columnNumber
        while (number > 0) {
            builder.append('A' + (number - 1) % 26)
            number = (number - 1) / 26
        }
        return builder.reversed().toString()
    }
}
