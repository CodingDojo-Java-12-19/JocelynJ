package com.jocelyn.dojos.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jocelyn.dojos.models.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja, Long>{
	List<Ninja> findAll();
}
