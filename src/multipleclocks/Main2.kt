package multipleclocks

import java.util.*

/**
 * 最大公約数を求める(ユークリッドの互除法)
 */
fun gcd(a: Long, b: Long): Long {
    if (b == 0.toLong()) return a
    return gcd(b, a % b)
}

/**
 * 最小公倍数を求める
 * 「ab = gcd(a, b)lcm(a, b)」の公式を利用 → lcm(a,b) = ab / gcd(a,b)
 */
fun lcm(a: Long, b: Long): Long {
    val g = gcd(a, b)
    return a / g * b
}

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()

    var ans = 1.toLong()
    for (i in 1..n) {
        val t = sc.nextLong()
        // 答え(ans)はTi(1 ≤ i ≤ N)で割り切れることからTi(1 ≤ i ≤ N)の公倍数です。T1...Tnの最小公倍数が今回の回答となる。
        // 答え(ans) = lcm(T1, · · · , TN ) = lcm(T1, lcm(T2, · · · lcm(TN−1, TN )· · ·))
        ans = lcm(ans, t)
    }

    println(ans)
}