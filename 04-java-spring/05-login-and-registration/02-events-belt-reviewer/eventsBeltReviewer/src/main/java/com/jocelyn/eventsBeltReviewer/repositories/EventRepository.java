package com.jocelyn.eventsBeltReviewer.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jocelyn.eventsBeltReviewer.models.Event;

@Repository
public interface EventRepository extends CrudRepository<Event, Long>{
	List<Event> findByState(String state);
	List<Event> findByStateIsNot(String state);
}
