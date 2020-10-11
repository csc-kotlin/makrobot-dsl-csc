@file:Suppress("FunctionName", "NonAsciiCharacters")

package csc.markobot.dsl

import csc.markobot.MakroBot
import csc.markobot.Schedule

@DslMarker
annotation class MakroBotDsl

@MakroBotDsl
class MakroBotScenario {
    private val actions = arrayListOf<()->Unit>()

    internal var schedule: Schedule? = null

    infix fun MakroBot.вперед(steps: Int) {
        this@MakroBotScenario.actions.add { stepForward(steps) }
    }

    infix fun MakroBot.назад(steps: Int) {
        this@MakroBotScenario.actions.add { stepBack(steps) }
    }

    fun MakroBot.развернуться() {
        this@MakroBotScenario.actions.add { turnAround() }
    }

    infix fun MakroBot.воспроизвести(source: String) {  // unaryPlus here ?
        this@MakroBotScenario.actions.add { playMusic(source) }
    }

    operator fun MakroBot.invoke(settings: MakroBot.() -> Unit) = this.settings()

    // no way to restrict it's call inside scenario
    fun запуститьСейчас(): MakroBotScenario {
        actions.forEach { it() }

        schedule?.let {
            println(it.toString())
        }
        return this
    }
}

fun сценарий(operations: MakroBotScenario.()->Unit): MakroBotScenario {
    return MakroBotScenario().apply(operations)
}
