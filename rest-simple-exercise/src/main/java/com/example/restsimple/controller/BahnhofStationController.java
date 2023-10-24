package com.example.restsimple.controller;

import com.example.restsimple.model.Strecke;
import com.example.restsimple.repository.StreckeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/strecken")
public class StreckeController {

    @Autowired
    private StreckeRepository streckeRepository;

    @GetMapping("/")
    public List<Strecke> getAllStrecken() {
        return streckeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Strecke> getStreckeById(@PathVariable Long id) {
        return streckeRepository.findByIdColumn(id);
    }

    @PostMapping("/")
    public Strecke createStrecke(@RequestBody Strecke strecke) {
        return streckeRepository.save(strecke);
    }

    @PutMapping("/{id}")
    public Strecke updateStrecke(@PathVariable Long id, @RequestBody Strecke strecke) {
        strecke.setId(id);
        return streckeRepository.save(strecke);
    }

    @DeleteMapping("/{id}")
    public void deleteStrecke(@PathVariable Long id) {
        streckeRepository.deleteByIdColumn(id);
    }
}