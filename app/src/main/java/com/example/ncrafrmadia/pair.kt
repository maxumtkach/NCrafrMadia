package com.example.ncrafrmadia

import java.io.Serializable

 data class Pair(
     val first: Double,
     val second: Double
) : Serializable {
     override fun toString(): String = "($first,$second)"

    //return super.toString()

}