package com.project.mock.homework.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "GRADE")
public class Grade {
	@Id
	@Column(name = "name")
	private String name;
	@Column(name = "desc")
	private String desc;
}
