package dev.primvsref;

import java.time.LocalDateTime;

public record Event(Integer id, String title, LocalDateTime start, LocalDateTime end) {

    public Event {
        if(end.isBefore(start)) {
            throw new IllegalArgumentException("End date comes before start date");
        }
    }
}
