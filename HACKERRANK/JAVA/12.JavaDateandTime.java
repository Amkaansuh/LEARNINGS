import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.DayOfWeek;
import java.util.Scanner;

public class JavaDateandTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();

        LocalDateTime dateTime = LocalDateTime.of(year, month, day, 0, 0, 0);
        DayOfWeek dayOfWeek = dateTime.getDayOfWeek();
        System.out.println(dayOfWeek);
    }
}