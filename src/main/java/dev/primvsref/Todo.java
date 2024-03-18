package dev.primvsref;

import java.util.Objects;

public record Todo(Integer userId, Integer id, String title, boolean completed) {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Todo todo)) return false;
        return completed() == todo.completed() && Objects.equals(userId(), todo.userId()) && Objects.equals(id(), todo.id()) && Objects.equals(title(), todo.title());
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId(), id(), title(), completed());
    }

    @Override
    public String toString() {
        return "Todo{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", completed=" + completed +
                '}';
    }
}
