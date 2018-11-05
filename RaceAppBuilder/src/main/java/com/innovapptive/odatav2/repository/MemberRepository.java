package com.innovapptive.odatav2.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.innovapptive.odatav2.entities.Member;

public interface MemberRepository extends CrudRepository<Member, Integer> {

    List<Member> findByLastName(String lastName);

}