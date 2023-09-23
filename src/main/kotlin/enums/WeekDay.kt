package enums

enum class WeekDay : IDay{
    MONDAY {
        override fun nextDay() = TUESDAY
    },
    TUESDAY {
        override fun nextDay() = WEDNESDAY
    },
    WEDNESDAY {
        override fun nextDay() = THURSDAY
    },
    THURSDAY {
        override fun nextDay() = FRIDAY
    },
    FRIDAY {
        override fun nextDay() = SATURDAY
    },
    SATURDAY {
        override fun nextDay() = SUNDAY
    },
    SUNDAY {
        override fun nextDay() = MONDAY
    }
}

