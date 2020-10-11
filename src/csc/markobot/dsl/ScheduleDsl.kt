@file:Suppress("EnumEntryName", "NonAsciiCharacters")
package csc.markobot.dsl

import csc.markobot.Schedule
import csc.markobot.WeekDay

typealias время = Pair<WeekDay, Int>

fun Schedule.повторять(vararg timePointsToAdd: время) {
    timePoints.addAll(timePointsToAdd)
}

fun Schedule.кроме(vararg daysOfMonth: Int) {
    exceptDaysOfMonth.addAll(daysOfMonth.toList())
}

infix fun WeekDay.в(hour: Int) = время(this, hour)
