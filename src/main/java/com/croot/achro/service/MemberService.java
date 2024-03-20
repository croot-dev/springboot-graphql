package com.croot.achro.service;

import graphql.kickstart.tools.GraphQLQueryResolver;

import java.util.List;

import org.springframework.stereotype.Service;

import com.croot.achro.model.Member;
import com.croot.achro.repository.MemberRepository;

@Service
public class MemberService implements GraphQLQueryResolver {
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
    public List<Member> getAllMembers(){
        return memberRepository.findAll();
    }
    public Member getMember(Integer id){
        return memberRepository.findById(id).get();
    }

}
