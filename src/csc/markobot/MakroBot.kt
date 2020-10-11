package csc.markobot

import csc.markobot.dsl.MakroBotDsl

@MakroBotDsl
class MakroBot(val name: String) {

    var speed: Int = 1

    var power = 1

    fun stepForward(steps: Int) = println("stepForward $steps")

    fun stepBack(steps: Int) = println("stepBack $steps")

    fun turnAround() = println("turnAround")

    fun playMusic(source: String) = println("play music from: $source")

    fun recordAudio(durationSec: Int): Audio {
        println("record audio for $durationSec sec")
        return Audio()
    }
}