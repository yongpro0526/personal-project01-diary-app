package com.diary.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity // 이 클래스는 JPA 메서드임을 선언
@Getter // 모든 필드에 Getter메서드 자동 생성
@NoArgsConstructor // 기본 생성자 자동 생성
@Table(name = "users") // 테이블 이름을 users로 설정.(DB마다 다르지만, User는 예약어이기 때문에 테이블 이름으로 사용 불가힐 가능성이 높음.)
public class User {
	
    @Id // PK를 나타내는 어노테이션
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT, 1씩 늘어남.
    private Long id;

    @Column(unique = true, nullable = false) // @Column으로 해당 컬럼에 대한 속성 설정. 이 컬럼은 UK와 NOT NULL
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, length = 20)
    private String name;
    
    @Column(nullable = false, unique = true, length = 20)
    private String nickname;
    
    private LocalDate birthDate;
    
    @Enumerated(EnumType.STRING)
    private Gender gender;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    
    public User(
    		String email
    ) {
    	this.email = email;
    }
    
}