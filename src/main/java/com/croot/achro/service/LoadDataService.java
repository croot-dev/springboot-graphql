package com.croot.achro.service;

import com.croot.achro.model.Member;
import com.croot.achro.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public class LoadDataService {

    @Autowired
    private MemberRepository memberRepository;

    @PostConstruct
    public void load() {
        // 데이터 추가
        for (int i = 1; i <= 10; i++) {
            Member member = new Member();
            member.setName("Member " + i); // Member 이름 설정
            member.setAge(i * 10); // Member 나이 설정
            memberRepository.save(member);
        }
    }
}