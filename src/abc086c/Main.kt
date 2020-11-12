package abc086c

import java.util.*
import kotlin.math.abs

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val t = Array<Int>(n + 1) { 0 }
    val x = Array<Int>(n + 1) { 0 }
    val y = Array<Int>(n + 1) { 0 }

    for (i in 1..n) {
        t[i] = scanner.nextInt()
        x[i] = scanner.nextInt()
        y[i] = scanner.nextInt()
    }

    for (i in 1..n) {
        val dt = t[i] - t[i - 1]
        val dist = abs(x[i] - x[i - 1]) + abs(y[i] - y[i - 1])
        if (dt < dist) {
            println("No")
            return
        }
        if (dt % 2 != dist % 2) {
            println("No")
            return
        }
    }

    println("Yes")
}