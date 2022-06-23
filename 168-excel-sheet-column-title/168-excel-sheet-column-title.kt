class Solution {
    fun convertToTitle(columnNumber: Int): String {
        val builder = StringBuilder()
        var number = columnNumber
        while (number > 0) {
            var i = (number - 1) % 26
            builder.append('A' + i)
            number = (number - i) / 26
        }
        return builder.reversed().toString()
    }
}
