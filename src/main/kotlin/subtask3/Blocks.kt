package subtask3

import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.reflect.KClass

class Blocks {

    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        return when (blockB) {
            Int::class -> {
                blockA.filterIsInstance<Int>().sum()

            }
            String::class -> {
                blockA.filterIsInstance<String>().joinToString("")

            }
            LocalDate::class -> {
                var date = blockA.filterIsInstance<LocalDate>().sorted().last()
                val formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy")
                date.format(formatter)

            }
            else -> {
                "class type not supported"
            }
        }
    }
}

