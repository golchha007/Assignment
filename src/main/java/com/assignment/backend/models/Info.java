package com.assignment.backend.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="info")
public class Info {

	@Id
	private String username;
	@NotNull
	private String hobbies;
	@NotNull
	private String achievement;
	@NotNull
	private String personality;
	@NotNull
	private String to_be_improved_skills;
	@NotNull
	private String interest_topics;

}
