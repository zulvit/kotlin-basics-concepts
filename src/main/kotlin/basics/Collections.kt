package basics

fun main() {
    //region list
    println("\tcreate immutable list:")
    val list = listOf("apple", "banana", "orange")
    println(list)

    println("\n\tcreate mutable list:")
    val mutableList = mutableListOf("apple", "banana")
    println(mutableList)

    println("\n\tchange mutable list:")
    mutableList.add("orange")
    println(mutableList)
    //endregion

    //region set
    println("\n\tset:")
    val set = setOf("+79165630303", "+79165630303", "+79165600000")
    println(set)
    //endregion
}