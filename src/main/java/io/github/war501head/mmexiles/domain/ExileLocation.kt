/*
 * MIT License
 *
 * Copyright (c) 2020 Sean Kelly (501warhead)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package io.github.war501head.mmexiles.domain

import org.bukkit.Bukkit
import org.bukkit.Location

data class ExileLocation(val x: Int, val y: Int, val z: Int, val world: String) {

    fun toLocation(): Location {
        val world = Bukkit.getWorld(world)
        if (world == null) {
            //throw exception
            throw Exception()
        }
        // Add 0.5 otherwise they'll end up at the corner of the block, small details
        return Location(world, x.toDouble() + 0.5, y.toDouble(), z.toDouble() + 0.5)
    }
}