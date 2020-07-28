package date_time;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Intro {
    public static  void main(String [] args){
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        LocalDate d1 = LocalDate.of(2020,12,31);
        LocalDate d2 = LocalDate.of(2020, Month.DECEMBER,31);

        System.out.println(d1);
        System.out.println(d2);

        LocalTime t1 = LocalTime.of(15,30,20);
        System.out.println(t1);

        LocalDate d3 = LocalDate.now().minusMonths(3);
        System.out.println(d3);
        // minus days, years
        // plus days,month
        //chrronounit.Decades
        // plus  or minus hours,minutes,seconds
        Period p = Period.between(d1,LocalDate.now());
        System.out.println(p.getDays());
        //getMonths,getYears()
        Duration d = Duration.between(t1,LocalTime.now());
        System.out.println(d);
        // toHours,toMinutes



        // ========== Date time formatter ======

        String str = "01-12-2019";
       // LocalDate d4 = LocalDate.parse(str);
       // System.out.println(d4);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("[MM-dd-YYYY]");
        LocalDate d5 = LocalDate.parse(str,formatter);
        System.out.println(d5);


    }
}
