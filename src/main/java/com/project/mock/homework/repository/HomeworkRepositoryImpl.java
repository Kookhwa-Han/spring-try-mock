package com.project.mock.homework.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.mock.homework.entity.Member;

@Repository
public interface HomeworkRepositoryImpl extends JpaRepository<Member, Integer> {
	List<Member> findByTeam(int team);
}
