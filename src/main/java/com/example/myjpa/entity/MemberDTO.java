package com.example.myjpa.entity;

import com.querydsl.core.annotations.QueryProjection;

import lombok.Getter;

@Getter
public class MemberDTO {
	private String name;
	private String email;
	
	@QueryProjection
	public MemberDTO(String name, String email) {
		this.name = name;
		this.email = email;
	}
}
