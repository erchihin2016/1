fun main() {
    val amount = 200
    val total = 12_000

    println("Без флага эксклюзивности: " + calculateFee(amount, total))
    println("С флагом эксклюзивности: " + calculateFee(amount, total, true))
}

fun calculateFee(amount: Int, total: Int, exclusive: Boolean = false): Double {
    var percent = 15.0
    if (total < 1000) percent = 30.0
    else if (total < 10000) percent = 25.0
    else if (total < 50000) percent = 20.0
    if (exclusive) percent -= 5.0
    return (amount.toDouble() / 100) * percent
}