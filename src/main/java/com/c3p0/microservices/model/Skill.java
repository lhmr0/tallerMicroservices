package com.c3p0.microservices.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity(name="skill")
@Table(name="skill")
public class Skill {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="name", length=50, nullable=false)
	private String name;
	
	@Column(name="experience", length=1, nullable=false)
	private String experience;
	
	@ManyToOne
	@JoinColumn(name="id_person", nullable=false)
	private Person person;

	
	
	public Skill(Integer id, String name, String experience) {
		super();
		this.id = id;
		this.name = name;
		this.experience = experience;
	}

	public Skill() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	

}
