package com.example.myjpa.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.myjpa.entity.MemberDTO;
import com.example.myjpa.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MemberController {

	private final MemberRepository memberRepository;
	
	@GetMapping("members/search")
	public ResponseEntity<List<MemberDTO>> selectMemberByNameOrEmail(
			@RequestParam String type, 
			@RequestParam String keyword){
		List<MemberDTO> list = memberRepository.findByNameOrEmail(type, keyword);
		return ResponseEntity.ok(list);
	}
}
