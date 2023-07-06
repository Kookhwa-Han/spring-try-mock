package com.project.mock.homework.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.mock.homework.entity.Member;
import com.project.mock.homework.service.HomeworkService;

@RequestMapping
@RestController
public class HomeworkController {
	@Autowired
	private HomeworkService homeworkService;

	@GetMapping("/{team}")
	public ResponseEntity<List<Member>> getList(@PathVariable int team) {
		List<Member> list = homeworkService.getList(team);
		return ResponseEntity.ok().body(list);
	}
}
