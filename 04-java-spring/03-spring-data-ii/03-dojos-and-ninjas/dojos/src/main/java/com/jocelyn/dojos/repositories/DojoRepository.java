package com.jocelyn.dojos.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jocelyn.dojos.models.Dojo;


public interface DojoRepository extends CrudRepository<Dojo, Long>{
	List<Dojo> findAll();
}
