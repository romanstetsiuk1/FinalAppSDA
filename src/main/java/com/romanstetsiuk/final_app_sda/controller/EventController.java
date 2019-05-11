package com.romanstetsiuk.final_app_sda.controller;

import com.romanstetsiuk.final_app_sda.entity.Event;
import com.romanstetsiuk.final_app_sda.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/events")
public class EventController {

    @Autowired
    private EventRepository eventRepository;

    @PostMapping
    public String addEvent(Event event) {
        eventRepository.save(event);
        return "It works";
    }

}
