package com.c3p0.microservices.Repository;

import org.springframework.stereotype.Repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.c3p0.microservices.model.Skill;

@Repository
public interface ISkillRepository extends JpaRepository<Skill, Integer>{
		
		@Query("select new com.c3p0.microservices.model.Skill(s.id, s.name, s.experience) " + "from skill s where s.person.id=:id")
		List<Skill> getSkillByPersonId(@Param("id")Integer id);
		
	}
