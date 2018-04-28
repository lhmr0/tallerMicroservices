package com.c3p0.microservices.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.c3p0.microservices.model.Person;

@Repository
public interface IPersonRepository extends JpaRepository<Person, Integer> {
	
	

}
