package main;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateDemo {
    public static void main(String[] args) {
        
        LocalDate today = LocalDate.now();
        System.out.println("Date: "+today);

        LocalDateTime today2 = LocalDateTime.now();
        System.out.println("Date: "+today2);

        LocalDate dob = LocalDate.of(2001, 12, 31);
        System.out.println("DOB: "+dob);

       System.out.println( LocalDate.now().plusDays(25));
    }
}
