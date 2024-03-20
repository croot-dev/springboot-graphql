package com.croot.graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.croot.graphql.model.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {
}
