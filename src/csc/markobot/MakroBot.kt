package csc.markobot

import csc.markobot.dsl.MakroBotDsl

@MakroBotDsl
class MakroBot(val name: String) {

    var speed: Int = 5

    var power = 3

    fun stepForward(steps: Int) = println("stepForward $steps")

    fun stepBack(steps: Int) = println("stepBack $steps")

    fun turnAround() = println("turnAround")

    fun pronounce(source: String) = println("pronounce: \n$source")

    fun recordAudio(durationSec: Int): Audio {
        println("record audio for $durationSec sec")
        return Audio()
    }
}