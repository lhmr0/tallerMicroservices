package com.c3p0.microservices.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c3p0.microservices.Repository.ISkillRepository;
import com.c3p0.microservices.model.Skill;
import com.c3p0.microservices.service.ISkillService;

@Service
public class SkillService implements ISkillService {

	@Autowired
	private ISkillRepository skillRepo;
	
	
	
	@Override
	public List<Skill> findAll() {
		// TODO Auto-generated method stub
		return skillRepo.findAll();
	}

	@Override
	public Skill create(Skill obj) {
		// TODO Auto-generated method stub
		return skillRepo.save(obj);
	}

	@Override
	public Optional<Skill> find(Integer id) {
		// TODO Auto-generated method stub
		return skillRepo.findById(id);
	}

	@Override
	public Skill update(Skill obj) {
		// TODO Auto-generated method stub
		return skillRepo.save(obj);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		skillRepo.deleteById(id);
		
	}

	@Override
	public List<Skill> getSkillByPersonId(Integer id) {
		// TODO Auto-generated method stub
		return skillRepo.getSkillByPersonId(id);
	}

	
}
