fun main() {
    print("Вес килограмм: ")
    val inputWeight = readLine()
    val weight = tryUserInput2(inputWeight)
    print("Рост метров: ")
    val inputHeight = readLine()
    val height = tryUserInput2(inputHeight)

    val result = bodyMassIndex(weight, height)
    print(result)
}

fun bodyMassIndex(weight: Float?, height: Float?): String {
    val index = weight!! / (height!! * height!!)
    return when (index) {
        in 0.0..16.0 -> "Выраженный дифицит массы"
        in 16.1..18.5 -> "Дифицит массы"
        in 18.6..25.0 -> "Норма"
        in 25.1..30.0 -> "Избыточная масса"
        in 30.1..35.0 -> "Ожирение"
        in 35.1..40.0 -> "Резкое ожирение"
        else -> "Очень резкое ожирение"
    }
}


fun tryUserInput2(input: String?): Float? {
    try {
        return input?.toFloat()
    } catch (e: Exception) {
        println("Параметры введены неверно!")
    }
    return 0.0F
}