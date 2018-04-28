package com.c3p0.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.*;
import org.springframework.web.bind.annotation.RestController;

import com.c3p0.microservices.model.Skill;
import com.c3p0.microservices.service.ISkillService;
import com.c3p0.microservices.service.impl.SkillService;

@RestController
@RequestMapping("/v1")
public class SkillController {
	
	@Autowired
	private ISkillService skillServ;
	
	@RequestMapping(value="/skills/{id}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Skill>> getAllSkill(@PathVariable("id") Integer id){
		List<Skill> list = new ArrayList<Skill>();
		try {
			list = skillServ.getSkillByPersonId(id);
		}catch (Exception e) {
			return new ResponseEntity<List<Skill>>(list, HttpStatus.INTERNAL_SERVER_ERROR);
		}		
		
		return new ResponseEntity<List<Skill>>(list, HttpStatus.OK);
		
		
	}
	

}
