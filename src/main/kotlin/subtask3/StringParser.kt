package subtask3

import java.util.*
import kotlin.collections.HashMap

class StringParser {

    fun getResult(inputString: String): Array<String> {
        val arrOpen = arrayListOf('(', '<', '[')
        val arrClose = arrayListOf(')', '>', ']')
        val stackOpen = arrayListOf<ArrayDeque<Int>>(ArrayDeque<Int>(), ArrayDeque<Int>(), ArrayDeque<Int>())

        val mapResult = HashMap<Int, String>()

        for ((index, char) in inputString.withIndex()) {
            for ((indexBracket, charOpen) in arrOpen.withIndex()) {
                val charClose = arrClose[indexBracket]

                if (char == charOpen) {
                    stackOpen[indexBracket].push(index)
                } else if (char == charClose) {
                    val start = stackOpen[indexBracket].pop()
                    mapResult.put(start, inputString.substring(start + 1, index))
                }
            }
        }

        var arrResult = emptyArray<String>()
        for (str in mapResult.toSortedMap().values)
            arrResult += str

        return arrResult
    }
}
