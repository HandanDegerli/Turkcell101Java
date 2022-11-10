package java101.enums;

import java.time.DayOfWeek;

public class Driver {
    public static void main(String[] args) {

        Months month = Months.January;
        System.out.println(month);

        Months[] values = Months.values();
        for (int i = 0; i< values.length; i++){
            System.out.println(values[i]);
        }

        Months valueOf = Months.valueOf("February");
        System.out.println(valueOf);

        DayOfWeek sunday = DayOfWeek.SUNDAY;
        System.out.println(sunday);

        DayOfWeek of = DayOfWeek.of(3);
        System.out.println(of);
    }
}
