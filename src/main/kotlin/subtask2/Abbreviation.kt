package subtask2

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
        val resultString = StringBuilder()
        for (letter in a) {
            if (b.contains(letter.toUpperCase())) {
                resultString.append(letter.toUpperCase())
            }
        }
        return if(resultString.toString() == b) { "YES" } else {"NO"}
    }
}
