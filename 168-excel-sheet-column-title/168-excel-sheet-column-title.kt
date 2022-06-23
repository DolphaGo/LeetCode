class Solution {
    fun convertToTitle(columnNumber: Int): String {
        val builder = StringBuilder()
        var number = columnNumber
        while (number > 0) {
            var i = number % 26
            if (i == 0) i = 26
            builder.append('A' + (i - 1))
            number = (number - i) / 26
        }
        return builder.reversed().toString()
    }
}
