package subtask2

class BillCounter {

    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val list = bill.toMutableList()
        if (k > -1 && k < list.size)
            list.removeAt(k)
        val correctAnna = list.toIntArray().sum() / 2
        if (b == correctAnna) {
            return "Bon Appetit"
        } else {
            return Integer.toString(b - correctAnna)
        }
    }
}
