package com.example.springtodoapp.data.mode;

import lombok.Data;

import java.time.Instant;

@Data
public class Todo {
    private String id;
    private boolean isComplete;
    private String description;
    private Instant createdAt;
    private Instant updatedAt;

    @Override
    public String toString() {
        return "Todo{" +
                "id='" + id + '\'' +
                ", isComplete=" + isComplete +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
