package com.c3p0.microservices.service;

import java.util.List;
import java.util.Optional;

public interface IService<T> {
	List<T> findAll();
	T create(T obj);
	Optional<T> find(Integer id);
	T update(T obj);
	void delete(Integer id);

}
