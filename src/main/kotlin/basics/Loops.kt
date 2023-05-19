package basics

val listFruits = listOf("Банан", "Яблоко", "Апельсин")
fun main() {
    //region loop for
    println("Обычный вывод коллекции в консоль: $listFruits")

    println("\n\tclassic for loop:")
    for (item in listFruits) {
        println("--- $item ---")
    }

    println("\n\tfor loop and steps:")
    for (i in 1..10 step 2) {
        println("Повтор цикла с шагом +2: $i")
    }

    for ((index, fruits) in listFruits.withIndex()) {
        println("Индекс: $index\tФрукт: $fruits")
    }

    //Ещё немного синтаксического сахара
    println("\n\trepeat:")
    repeat(5) {
        println("Это сообщение будет повторяться 5 раз")
    }

    /*
        It - представление единственного аргумента лямбда-выражения, когда его тип не объявлен явно
        В Kotlin циклы for с использованием итераторов и операторов диапазона принимают лямбда-выражения в качестве параметров.
        В случае с оператором диапазона лямбда-выражение не объявляется явно, но это выражение генерируется автоматически компилятором.
     */
    println("\n\trepeat and it:")
    repeat(listFruits.size) {
        println(listFruits[it])
    }

    println("\n\tforEach:")
    listFruits.forEach {
        println(it)
    }
    //endregion

    //region loop while
    var num = 10
    println("\n\tclassic while loop:")
    while (num > 0) {
        println("Переменная уменьшается: $num")
        num--
    }
    //endregion
}