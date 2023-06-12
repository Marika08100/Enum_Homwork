public enum Month {
    JANUARY("január"),
    FEBRUARY("február"),
    MARCH("március"),
    APRIL("április"),
    MAY("május"),
    JUNE("június"),
    JULY("július"),
    AUGUST("augusztus"),
    SEPTEMBER("szeptember"),
    OCTOBER("október"),
    NOVEMBER("november"),
    DECEMBER("december");
    private String hungarianName;

    Month(String hungarianName) {
        this.hungarianName = hungarianName;
    }

    public String getHungarianName() {
        return this.hungarianName;
    }

    public boolean isSummerMonth() {
        return this == JUNE || this == JULY || this == AUGUST;
    }

    public boolean isAutumnMonth() {
        return this == SEPTEMBER || this == OCTOBER || this == NOVEMBER;
    }

    public boolean isWinterMonth() {
        return this == DECEMBER || this == JANUARY || this == FEBRUARY;
    }

    public boolean isSpringMonth() {
        return this == MARCH || this == APRIL || this == MAY;
    }

    public int getMonthNumber() {
        return this.ordinal() + 1;
    }

}
