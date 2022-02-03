package com.example.practical1.controllers;

import com.example.practical1.PlantInventoryEntryRepository;
import com.example.practical1.models.PlantInventoryEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PlantInventoryEntryController {

    @Autowired
    PlantInventoryEntryRepository repo;

    @GetMapping("/plants")
    public String list(Model model) {
        model.addAttribute("plants", repo.findAll());
        return "plants/list";
    }

    @GetMapping(value = "/plants/form")
    public String form(Model model) {
        model.addAttribute("plant", new PlantInventoryEntry());
        return "plants/create";
    }

    @PostMapping(value = "/plants")
    public String create(PlantInventoryEntry plant) {
        repo.save(plant);
        return "redirect:/plants";
    }
}