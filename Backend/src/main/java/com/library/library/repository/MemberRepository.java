package com.library.library.repository;

import com.library.library.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
	public List<Member> findAllByOrderByFirstNameAscMiddleNameAscLastNameAsc();
	public Long countByType(String type);
}