package dev.primvsref;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class EventTest {

    @Test
    void shouldThrowIllegalArgumentExceptionWhenEndIsBeforeStart() {
        assertThrows(IllegalArgumentException.class,
                () -> new Event(
                        1,
                        "SpringOne",
                        LocalDateTime.now().plusDays(30),
                        LocalDateTime.now()
                )
        );
    }
}