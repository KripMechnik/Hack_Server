package com.samsung.spring.controller;

import com.samsung.spring.domain.Landmark;
import com.samsung.spring.service.LandmarkService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final LandmarkService landmarkService;

    @PostMapping("/landmark")
    public Landmark add(@RequestBody Landmark user) {
        return landmarkService.add(user);
    }

    @GetMapping("/landmark")
    public List<Landmark> getAll() {
        return landmarkService.getAll();
    }

    @GetMapping("/landmark/{id}")
    public Landmark getById(@PathVariable long id) {
        return landmarkService.getById(id);
    }

    @PutMapping("/user/{id}")
    public Landmark update(@PathVariable long id, @RequestBody Landmark user) {
        return landmarkService.update(id, user);
    }

    @DeleteMapping("/user/{id}")
    public void deleteById(@PathVariable long id) {
        landmarkService.deleteById(id);
    }
}
