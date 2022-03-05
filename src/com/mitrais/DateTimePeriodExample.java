package com.mitrais;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTimePeriodExample {

    private final LocalDate theDay;
    private final LocalTime startTime;
    private final LocalTime endTime;
    private final LocalDateTime newYear;

    public DateTimePeriodExample() {
        this.theDay = LocalDate.of(1998, 5, 22);
        this.startTime = LocalTime.parse("07:00");
        this.endTime = LocalTime.parse("16:00");
        this.newYear = LocalDateTime.of(2023, 1, 1, 0, 0);
    }

    public void countAge() {
        Period period = Period.between(this.theDay, LocalDate.now());
        System.out.print(period.getYears() + " years,");
        System.out.print(period.getMonths() + " months,");
        System.out.println(period.getDays() + " days");
    }

    public long countWorkingSeconds() {
        return Duration.between(this.startTime, this.endTime).getSeconds();
    }

    public long countMinutesToNewYear() {
        return ChronoUnit.MINUTES.between(LocalDateTime.now(), this.newYear);
    }
}
