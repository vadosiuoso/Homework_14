package com.example.todo.model;

import java.util.Random;
import java.util.UUID;

public class Note {
    private final long id = new Random().nextLong();
    private String title;
    private String content;


    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
