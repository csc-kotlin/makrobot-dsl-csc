@file:Suppress("LocalVariableName", "NonAsciiCharacters")

package csc.makrobot.dsl

import csc.markobot.MakroBot
import csc.markobot.WeekDay.*
import csc.markobot.dsl.в
import csc.markobot.dsl.кроме
import csc.markobot.dsl.повторять
import csc.markobot.расписание
import csc.markobot.dsl.сценарий
import csc.markobot.сброситьРасписание

fun main() {
    val робот = MakroBot("Маша")

    сценарий {
        робот {                             // invoke operator overload
            speed = 2                       // initialization DSL
            power = 3
        }

        робот вперед 3                      // infix functions
        робот воспроизвести "Калинка-Малинка"
        робот.развернуться()
        робот назад 3

        расписание {                        // context-based high level function with context-lambda

            робот вперед 3                  // control methods availability with @DslMarker

            повторять(вт в 10, сб в 12)     // typealias, infix functions
            кроме(13)
        }

    }.запуститьСейчас()
        .сброситьРасписание()               // calls chaining
        .расписание {
            повторять(пт в 23)
        }
}

//chaining, invoke, properties
//контроль доступности методов/свойств