package enums

enum class PreciousMetal: IMetalPrice {
    RHODIUM {
        override fun price() = 302220;
    },
    PLATINUM {
        override  fun price() = 3003;
    },
    GOLD {
      override  fun price () = 59040;
    },
    PALLADIUM {
        override fun price () = 46400;
    },
}