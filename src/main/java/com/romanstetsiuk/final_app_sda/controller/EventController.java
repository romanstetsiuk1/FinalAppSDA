package com.romanstetsiuk.final_app_sda.controller;

import com.romanstetsiuk.final_app_sda.entity.Event;
import com.romanstetsiuk.final_app_sda.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/events")
public class EventController {

    @Autowired
    private EventRepository eventRepository;

    @GetMapping
    public List<Event> getAllEvents() {
        return (List<Event>) eventRepository.findAll();
    }

    @PostMapping
    public Event addEvent(@RequestBody Event event) {

        return eventRepository.save(event);
    }

}
