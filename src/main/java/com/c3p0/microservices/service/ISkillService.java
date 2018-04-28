package com.c3p0.microservices.service;
import java.util.List;

import com.c3p0.microservices.model.Skill;

public interface ISkillService extends IService<Skill> {
	
	List<Skill> getSkillByPersonId(Integer id);

}
