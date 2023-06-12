public enum Seasons {
    WINTER("Tel"),
    SPRING("Tavasz"),
    SUMMER("Nyar"),
    AUTUMN("Osz");

    public static Seasons getSeasonByMonth(Month month) {
        return switch (month) {
            case MARCH, APRIL, MAY -> SPRING;
            case JUNE, JULY, AUGUST -> SUMMER;
            case SEPTEMBER, OCTOBER, NOVEMBER -> AUTUMN;
            case DECEMBER, JANUARY, FEBRUARY -> WINTER;
        };

    }
    private String hungarianName;
    Seasons(String hungarianName) {
        this.hungarianName = hungarianName;
    }

    public String getHungarianName() {
        return switch (this){
            case SPRING -> "Tavasz";
            case SUMMER -> "Nyár";
            case AUTUMN -> "Osz";
            case WINTER ->  "Tel";
        };
        // en ezt valasztanam!
    }


}
