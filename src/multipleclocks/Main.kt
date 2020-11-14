package multipleclocks

import java.util.*

/**
 * https://atcoder.jp/contests/abc070/tasks/abc070_c
 */
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val t = Array<Long>(n) { sc.nextLong() }
    val tMax: Long = t.max()!!.toLong()

    var count = 0
    var allUp = false
    while (!allUp) {
        count++
        run {
            t.forEach {
                if (tMax * count % it != 0.toLong()) return@run
            }
            allUp = true
        }
    }
    println(tMax * count)
}