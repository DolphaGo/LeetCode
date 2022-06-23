class Solution {
    fun convertToTitle(columnNumber: Int): String = if (columnNumber == 0) "" else convertToTitle((columnNumber - 1) / 26) + ('A' + ((columnNumber - 1) % 26))
}
