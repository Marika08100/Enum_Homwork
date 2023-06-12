public class Main {
    public static void main(String[] args) {
        System.out.println("Current month: " + Month.JUNE);

        for(Month month : Month.values()){
            System.out.println(month);

        }
        System.out.println("Current season " + Seasons.SUMMER);
        for(Seasons season: Seasons.values()){
            System.out.println(season);
        }
        System.out.println(Month.JUNE.getHungarianName());
        System.out.println(Month.JUNE.isAutumnMonth());
        System.out.println(Month.APRIL.isSpringMonth());
        System.out.println(Month.DECEMBER.isSummerMonth());
        System.out.println(Month.FEBRUARY.isWinterMonth());
        for(Month month : Month.values()){
            System.out.println(month.getMonthNumber() + ".hónap: " + month.getHungarianName());

        }


    }
}