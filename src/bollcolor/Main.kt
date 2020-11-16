package bollcolor

import java.util.*


/**
 * https://atcoder.jp/contests/abc046/tasks/abc046_b
 */
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()

    val result = k * Math.pow((k - 1).toDouble(), (n - 1).toDouble())
    println(result.toLong())
}