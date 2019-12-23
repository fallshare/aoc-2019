package com.github.corneil.aoc2019.day19

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.Test

class TestRobot {
    @Test
    fun testLoad() {
        val input = """#.........
        .#........
        ..##......
        ..###....
        ....###...
        .....####.
        ......####
        ......####
        .......###
        ........##
        """.trimIndent()
        val grid = readGrid(input)
        val output = grid.printToString()
        println(output)
        val affected = grid.cells.values.count { it == '#' }
        assertThat(affected).isEqualTo(27)
    }

    @Test
    fun test2() {
        val input = """
#.......................................
.#......................................
..##....................................
...###..................................
....###.................................
.....####...............................
......#####.............................
......######............................
.......#######..........................
........########........................
.........#########......................
..........#########.....................
...........##########...................
...........############.................
............############................
.............#############..............
..............##############............
...............###############..........
................###############.........
................#################.......
.................##################.....
..................##################....
...................###################..
....................####################
.....................###################
.....................###################
......................##################
.......................#################
........................################
.........................###############
..........................##############
..........................##############
...........................#############
............................############
.............................###########
""".trimIndent()

        val grid = readGrid(input)
        println(grid.printToString())
        val exit = Pair(Coord(0, 0), Coord(0, 0))
        val result = checkSolution(grid,10)
        assertThat(result).isEqualTo(250020L) // My view is that is should be 270022
    }
}