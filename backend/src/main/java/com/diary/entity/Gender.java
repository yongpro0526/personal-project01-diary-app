package com.diary.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Gender {
	
	MALE("남자"),
	FEMALE("여자"),
	OTHER("기타");

	private final String description;
	
	Gender(String description) {
		this.description = description;
	}
}