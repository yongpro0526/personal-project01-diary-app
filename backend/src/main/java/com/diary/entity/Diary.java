package com.diary.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "diaries")
public class Diary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String title;
    private String content;

    private LocalDateTime createdAt;
}
