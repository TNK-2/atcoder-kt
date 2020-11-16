package trainingcamp

import java.util.*
import kotlin.math.pow

/**
 * https://atcoder.jp/contests/abc055/tasks/abc055_b
 */
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()

    var result = 1.toLong()
    val div = 10.0.pow(9.0).toLong() + 7
    for(i in 1..n) {
       result = (result * i) % div
    }

    println(result)
}