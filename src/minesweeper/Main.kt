package minesweeper

import java.util.*

/**
 * https://atcoder.jp/contests/abc075/tasks/abc075_b
 */
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h = sc.nextInt()
    val w = sc.nextInt()

    val squares = Array(h) {
        val row = sc.next()
        Array(w) { i -> row[i].toString() }
    }

    val results = squares.mapIndexed { i, row ->
        row.mapIndexed { j, square ->
            var count = 0
            if (squares[i][j] == "#") {
                return@mapIndexed "#"
            }
            if (i > 0 && j > 0 && squares[i - 1][j - 1] == "#") ++count
            if (i > 0 && squares[i - 1][j] == "#") ++count
            if (i > 0 && w - 1 > j && squares[i - 1][j + 1] == "#") ++count

            if (j > 0 && squares[i][j - 1] == "#") ++count
            if (w - 1 > j && squares[i][j + 1] == "#") ++count

            if (h - 1 > i && j > 0 && squares[i + 1][j - 1] == "#") ++count
            if (h - 1 > i && squares[i + 1][j] == "#") ++count
            if (h - 1 > i && w - 1 > j && squares[i + 1][j + 1] == "#") ++count
            count
        }
    }

    results.forEach{ row ->
        row.forEach{ print(it) }
        println()
    }
}