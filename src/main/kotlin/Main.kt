import kotlin.random.Random

fun main(args: Array<String>) {
    //1 задание
    val ex1 = Random.nextInt(1, 11)
    val ex2 = Random.nextInt(1, 11)
    val ex3 = Random.nextInt(1, 11)
    println("Итог 1 экзамена: " + ex1)
    println("Итог 2 экзамена: " + ex2)
    println("Итог 3 экзамена: " + ex3)
    when(ex1){
        in 1..5 -> println("Ученик к 1 экзамену подготовился плохо.")
        else -> println("Ученик к 1 экзамену подготовился хорошо.")
    }
    when(ex2){
        in 1..5 -> println("Ученик к 2 экзамену подготовился плохо.")
        else -> println("Ученик к 2 экзамену подготовился хорошо.")
    }
    when(ex3){
        in 1..5 -> println("Ученик к 3 экзамену подготовился плохо.")
        else -> println("Ученик к 3 экзамену подготовился хорошо.")
    }
    println("  ")
    main2()
    println("  ")
    main3()
    println("  ")
    main4()
    println("  ")
    main5()
    println("  ")
    main6()
}
fun main2() {
    //2 задание
    println("Итоги выстрелов: ")
    val p1 = Random.nextInt(2)
    val p2 = Random.nextInt(2)
    val p3 = Random.nextInt(2)
    when(p1){
        0 -> println("0 баллов.")
        1 -> println("1 балл.")
    }
    when(p2){
        0 -> println("0 баллов.")
        1 -> println("1 балл.")
    }
    when(p3){
        0 -> println("0 баллов.")
        1 -> println("1 балл.")
    }
    val s = p1 + p2 + p3
    println("Результат: " + s + " балл(а).")
}
fun main3() {
    //3 задание
    var xyz = 10000000
    val n = xyz/1000
    for (i in 1..10) {
        val r = Random.nextInt(7, 15)
        val s = Random.nextInt(6, 9)
        xyz += (r * n) - (s * n)
    }
    println("Численность через 10 лет составляет: " + xyz)
}
fun main4() {
    //4 задание
    print("Введите сумму вклада: ")
    var s = readLine()!!.toFloat()
    print("Введите срок вклада в месяцах: ")
    val v = readLine()!!.toInt()
    for(i in 1..v){
        s += s * 0.07f
    }
    println("После $v месяцев сумма вклада составит: $s")

}
fun main5() {
    //5 задание
    print("Введите сумму вклада: ")
    var s = readLine()!!.toFloat()
    print("Введите срок вклада в месяцах: ")
    val v = readLine()!!.toInt()
    var i = 0
    while (i < v){
        s += s * 0.07f
        i++;
    }
    println("После $v месяцев сумма вклада составит: $s")

}
fun main6() {
    //6 задание
    for(i in 1..9){
        for(j in 1..9){
            print("${i * j} \t")
        }
        println()
    }
}
