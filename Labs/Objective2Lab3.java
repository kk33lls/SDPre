import java.time.DayOfWeek;
import java.time.LocalDate;

public class Objective2Lab3 {
  public static void main(String[] args) {
    int year = 1998;
    String month = "May";
    LocalDate today = LocalDate.now();
    DayOfWeek dayOfWeek = today.getDayOfWeek();
    boolean isWeekend = (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY);

    System.out.println(year);
    System.out.println(month);
    System.out.println(isWeekend);
  }

}
