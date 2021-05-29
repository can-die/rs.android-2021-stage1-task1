package subtask1

class HappyArray {
    fun convertToHappy(sadArray: IntArray): IntArray {
        val list = sadArray.toMutableList()
        while (! isHappy(list)) {
            for (i in 1..list.size - 2) {
                if (list[i-1] + list[i+1] < list[i]) {
                    list.removeAt(i)
                    break
                }

            }
        }
        return list.toIntArray()
    }

    private fun isHappy(list: MutableList<Int>): Boolean {
        for (i in 1..list.size - 2) {
            if (list[i-1] + list[i+1] < list[i])
                return false
        }
        return true
    }
}
