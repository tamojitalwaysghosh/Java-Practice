package dateUse;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main{
    public static void main(String[] args){
        LocalDate date=LocalDate.now();
        System.out.println(date);
        //o|p: 2024-05-14

        LocalTime time=LocalTime.now();
        System.out.println(time);
        //o|p: 13:17:17.831121200

        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);
        //o|p: 2024-05-14T13:17:17.831121200

        //DateTimeFormatter myFormat=DateTimeFormatter.ofPattern("dd-MM-yyy hh:mm:ss");
        //yyy also-> 2024 same for yyyy
        //14-05-2024 01:22:10
        DateTimeFormatter myFormat=DateTimeFormatter.ofPattern("dd-MM-yy hh:mm:ss");
        String formatted= dt.format(myFormat);
        System.out.println(formatted);
        // 2024-05-14
        // 13:23:49.176550400
        // 2024-05-14T13:23:49.177546200
        // 14-05-24 01:23:49
    }
}