package com.project.mock.homework.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.mock.homework.entity.Member;
import com.project.mock.homework.repository.HomeworkRepositoryImpl;

@Service
public class HomeworkService {

	@Autowired
	private HomeworkRepositoryImpl homeworkRepository;

	public List<Member> getList(int team) {
		return homeworkRepository.findByTeam(team);
	}
}
