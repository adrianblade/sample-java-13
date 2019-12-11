package com.adr.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
public class ItemController {

    List<Integer> list = List.of(1, 2, 3);
    Set<String> set = Set.of("a", "b", "c");
    Map<Integer, Integer> map = Map.of(1, 2, 3, 4, 5, 6);

    @GetMapping("/items")
    List<Integer> all() {
        return list;
    }
}
