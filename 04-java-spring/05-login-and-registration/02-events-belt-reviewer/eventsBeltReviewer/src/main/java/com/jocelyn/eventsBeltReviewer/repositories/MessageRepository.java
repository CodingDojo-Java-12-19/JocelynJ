package com.jocelyn.eventsBeltReviewer.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jocelyn.eventsBeltReviewer.models.Message;

@Repository
public interface MessageRepository extends CrudRepository<Message, Long>{

}
