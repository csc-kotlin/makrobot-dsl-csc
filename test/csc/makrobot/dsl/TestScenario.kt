@file:Suppress("LocalVariableName", "NonAsciiCharacters")

package csc.makrobot.dsl

import csc.markobot.MakroBot
import csc.markobot.WeekDay.*
import csc.markobot.dsl.*

fun main() {
    val робот = MakroBot("Маша")

    сценарий {
        робот {                             // invoke operator overload
            speed = 2                       // initialization DSL
            power = 3
        }

        робот вперед 3                      // infix functions
        робот.воспроизвести {
            +"Во поле береза стояла"
            +"Во поле кудрявая стояла"
        }
        робот.развернуться()
        робот назад 3

        расписание {                        // context-based high level function with context-lambda

            //робот вперед 3                // control methods availability with @DslMarker

            повторять(пн в 10, вт в 12)     // typealias, infix functions, vararg
            кроме(13)
            повторять(ср..пт в 11)
        }

    }.запуститьСейчас()
        .сброситьРасписание()               // calls chaining
        .расписание {
            повторять(пт в 23)
        }

    val (name, speed) = робот               // destructuring declarations
}
