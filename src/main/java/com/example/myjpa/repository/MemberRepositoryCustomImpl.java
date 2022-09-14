package com.example.myjpa.repository;

import java.util.List;

import com.example.myjpa.entity.MemberDTO;
import com.example.myjpa.entity.QMember;
import com.example.myjpa.entity.QMemberDTO;
import com.querydsl.jpa.impl.JPAQueryFactory;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MemberRepositoryCustomImpl implements MemberRepositoryCustom {

	private final JPAQueryFactory jpaQueryFactory;
	private final QMember qMember = QMember.member;
	
	@Override
	public List<MemberDTO> findByNameOrEmail(String type, String keyword) {
		
		List<MemberDTO> content = jpaQueryFactory
				.select(new QMemberDTO(qMember.name, qMember.email))
				.from(qMember)
				.where(qMember.email.contains(keyword))
				.fetch();
		return content;
	}
}
