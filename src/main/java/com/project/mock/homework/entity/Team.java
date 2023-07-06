package com.project.mock.homework.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "TEAM")
public class Team {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "leader")
	private int leader;
	@Column(name = "leader_name")
	private String leaderName;
}
