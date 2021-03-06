package com.jooones.rdc.model

import java.time.LocalDate

class Day(var dayOfWeek: Int, var dayOfMonth: Int, var monthOfYear: Int, var year: String, var developVersion: String, var rcVersion: String, var stgVersion: String, var prdVersion: String, var dayType: DayType = DayType.NORMAL) {

    var top: String = ""
    var bottom: String = ""

    fun getLocalDate(): LocalDate {
        return LocalDate.of(year.toInt(), monthOfYear, dayOfMonth);
    }

    override fun toString(): String {
        return "Day(dayOfWeek=$dayOfWeek, dayOfMonth=$dayOfMonth, monthOfYear=$monthOfYear, year='$year', developVersion='$developVersion', rcVersion='$rcVersion', stgVersion='$stgVersion', prdVersion='$prdVersion', dayType=$dayType, top=$top, bottom=$bottom)"
    }
}
