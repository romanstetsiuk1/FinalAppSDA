package com.romanstetsiuk.final_app_sda.repository;

import com.romanstetsiuk.final_app_sda.entity.Event;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface EventRepository extends CrudRepository<Event, Integer> {

}
