package com.example.restsimple.controller;

import com.example.restsimple.model.Zug;
import com.example.restsimple.repository.ZugRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/zuege")
public class ZugController {

    @Autowired
    private ZugRepository zugRepository;

    @GetMapping("/")
    public List<Zug> getAllZuege() {
        return zugRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Zug> getZugById(@PathVariable Long id) {
        return zugRepository.findByIdColumn(id);
    }

    @PostMapping("/")
    public Zug createZug(@RequestBody Zug zug) {
        return zugRepository.save(zug);
    }

    @PutMapping("/{id}")
    public Zug updateZug(@PathVariable Long id, @RequestBody Zug zug) {
        zug.setId(id);
        return zugRepository.save(zug);
    }

    @DeleteMapping("/{id}")
    public void deleteZug(@PathVariable Long id) {
        zugRepository.deleteByIdColumn(id);
    }
}