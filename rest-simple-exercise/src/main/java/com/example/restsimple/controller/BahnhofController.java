package com.example.restsimple.controller;

import com.example.restsimple.model.Bahnhof;
import com.example.restsimple.repository.BahnhofRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/bahnhoefe")
public class BahnhofController {

    @Autowired
    private BahnhofRepository bahnhofRepository;

    @GetMapping("/")
    public List<Bahnhof> getAllBahnhoefe() {
        return bahnhofRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Bahnhof> getBahnhofById(@PathVariable Long id) {
        return bahnhofRepository.findByIdColumn(id);
    }

    @PostMapping("/")
    public Bahnhof createBahnhof(@RequestBody Bahnhof bahnhof) {
        return bahnhofRepository.save(bahnhof);
    }

    @PutMapping("/{id}")
    public Bahnhof updateBahnhof(@PathVariable Long id, @RequestBody Bahnhof bahnhof) {
        bahnhof.setId(id);
        return bahnhofRepository.save(bahnhof);
    }

    @DeleteMapping("/{id}")
    public void deleteBahnhof(@PathVariable Long id) {
        bahnhofRepository.deleteByIdColumn(id);
    }
}
