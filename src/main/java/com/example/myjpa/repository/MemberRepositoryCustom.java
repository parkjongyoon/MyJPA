package com.example.myjpa.repository;

import java.util.List;

import com.example.myjpa.entity.MemberDTO;

public interface MemberRepositoryCustom {

	List<MemberDTO> findByNameOrEmail(String type, String keyword);
}
