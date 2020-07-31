import java.lang.Exception
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.Period
import java.time.temporal.ChronoUnit
import java.util.*

fun main() {
    print("Enter a date YYYY-MM-DD: ")
    val eventDate: String? = readLine()

    val currentDate = getCurrentDate()
    println("Today is $currentDate")

    val timeAgo = getTimeAgo(eventDate, currentDate)
    println("Time ago: $timeAgo")
}

fun getCurrentDate(): String {
    val sdf = SimpleDateFormat("yyyy-MM-dd")
    val currentDate = sdf.format(Date())
    return currentDate.toString()
}

fun getTimeAgo(eventDate: String?, currentData: String?): String {
    try {
        val eventDate = LocalDate.parse(eventDate)
        val currentDate = LocalDate.parse(currentData)
        val period = Period.between(eventDate, currentDate)

        return "passed " + period.years + " years " + period.months + " months " + " and " + period.days + " days"
    } catch (e: Exception) {
        return "Input date must be in YYYY-MM-DD format!"
    }
}