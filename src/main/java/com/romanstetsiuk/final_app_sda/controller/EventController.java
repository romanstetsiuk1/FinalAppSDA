package com.romanstetsiuk.final_app_sda.controller;

import com.romanstetsiuk.final_app_sda.entity.Event;
import com.romanstetsiuk.final_app_sda.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/events")
public class EventController {

    @Autowired
    private EventRepository eventRepository;

    @GetMapping
    public List<Event> getAllEvents() {
        return (List<Event>) eventRepository.findAll();
    }

//    @PostMapping
//    public Event addEvent(@RequestBody Event event) {
//        return eventRepository.save(event);
//    }

    @PostMapping("/addEvent")
    String addFromForm (@RequestParam("theme") String theme,
                        @RequestParam("location") String location,
                        @RequestParam("date_time_start") String date_time_start,
                        @RequestParam("date_time_end") String date_time_end,
                        Event event) {
         eventRepository.save(event);
         return "events";
    }

    @GetMapping(path = "/myEvents")
    String showEvents() {
        return "events";
    }

}
