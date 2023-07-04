package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        if(year % 4 != 0 || year == 1900)
            System.out.println("not leap");
        else
            System.out.println("leap");

    }
}
