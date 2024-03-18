package dev.primvsref;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostTest {

    @Test
    void shouldCreateNewPost() {
        Post post = new Post(1, "Hello World", "This is my first post", "james");

        assertAll(
                () -> assertEquals(1, post.id()),
                () -> assertEquals("Hello World", post.title()),
                () -> assertEquals("This is my first post", post.body()),
                () -> assertEquals("james", post.author())
        );
    }

}