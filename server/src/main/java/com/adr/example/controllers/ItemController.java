package com.adr.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
public class ItemController {

    @GetMapping("/items")
    List<Integer> all() {
        return new ArrayList<>();
    }
}
