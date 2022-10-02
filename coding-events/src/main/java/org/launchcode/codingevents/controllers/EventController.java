package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

    private static List<String> events = new ArrayList<>();

    @GetMapping
    public String displayAllEvents(Model model) {
       model.addAttribute("events", events);
        return "events/index";
    }

    //lives at /events/create - can be same as below b/c diff type of request- this one is GET
    @GetMapping("create")
    public String renderCreateEventForm() {
        return "events/create";
    }
//    lives at events/create - can be same as above b/c diff type of request - this one is POST
    @PostMapping("create")
    public String createEvent(@RequestParam String eventName) {
        events.add(eventName);
        return "redirect:";

    }
}


