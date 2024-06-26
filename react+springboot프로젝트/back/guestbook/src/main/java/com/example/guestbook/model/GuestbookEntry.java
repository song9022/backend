package com.example.guestbook.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class GuestbookEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String message;

    @Column(nullable = false)
    private LocalDateTime dateCreated;

    // 기본 생성자
    public GuestbookEntry() {}

    // 생성자
    public GuestbookEntry(String name, String message, LocalDateTime dateCreated) {
        this.name = name;
        this.message = message;
        this.dateCreated = dateCreated;
    }

    // 게터 및 세터
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }
}
