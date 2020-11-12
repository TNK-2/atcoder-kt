package twoswitches

import java.util.*

/**
 * https://atcoder.jp/contests/abc070/tasks/abc070_b
 */
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    val d = sc.nextInt()

    val result = if (a <= c) {
        if (b >= d) {
            d - c
        } else {
            b - c
        }
    } else {
        if (b <= d) {
            b - a
        } else {
            d - a
        }
    }

    if (result > 0) {
        println(result)
    } else {
        println(0)
    }
}