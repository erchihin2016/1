fun main() {
    print("Enter your total sale: ")
    val userInput = readLine()
    val totalSale = tryUserInput(userInput)

    print("Exclusive author press 1, else press 2: ")
    val exclusive = when (readLine()) {
        "1" -> true
        else -> false
    }

    val fee = calculateFee(totalSale, exclusive)
    println("Your fee is: $fee%")
}

fun calculateFee(total: Int?, exclusive: Boolean = false): Int {
    val percent = when (total) {
        in 0..1000 -> 30
        in 1001..10000 -> 25
        in 10001..50000 -> 20
        else -> 15
    }

    return when (exclusive) {
        true -> percent - 5
        else -> percent
    }
}

fun tryUserInput(input: String?): Int? {
    try {
        return input?.toInt()
    } catch (e: Exception) {
        println("Incorrect input!")
    }
    return 0
}