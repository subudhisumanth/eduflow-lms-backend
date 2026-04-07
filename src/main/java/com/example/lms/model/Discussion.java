package com.example.lms.model;

public class Discussion {
    private Long id;
    private String author;
    private String topic;
    private String content;

    public Discussion() {}

    public Discussion(Long id, String author, String topic, String content) {
        this.id = id;
        this.author = author;
        this.topic = topic;
        this.content = content;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getTopic() { return topic; }
    public void setTopic(String topic) { this.topic = topic; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
}
