package dev.primvsref;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TodoTest {

    @Test
    void shouldCreateTodoWithDefaultValues() {
        var todo = new Todo(1, 0, "First Task", false);

        assertAll(
                () -> assertEquals(1, todo.userId()),
                () -> assertEquals(0, todo.id()),
                () -> assertEquals("First Task", todo.title()),
                () -> assertFalse(todo.completed())
        );
    }

}