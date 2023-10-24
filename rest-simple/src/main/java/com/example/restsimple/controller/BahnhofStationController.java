package com.example.restsimple.controller;

import com.example.restsimple.model.BahnhofStation;
import com.example.restsimple.repository.BahnhofStationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/bahnhofstationen")
public class BahnhofStationController {

    @Autowired
    private BahnhofStationRepository bahnhofStationRepository;

    @GetMapping("/")
    public List<BahnhofStation> getAllBahnhofStationen() {
        return bahnhofStationRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<BahnhofStation> getBahnhofStationById(@PathVariable Long id) {
        return bahnhofStationRepository.findByIdColumn(id);
    }

    @PostMapping("/")
    public BahnhofStation createBahnhofStation(@RequestBody BahnhofStation bahnhofStation) {
        return bahnhofStationRepository.save(bahnhofStation);
    }

    @PutMapping("/{id}")
    public BahnhofStation updateBahnhofStation(@PathVariable Long id, @RequestBody BahnhofStation bahnhofStation) {
        bahnhofStation.setId(id);
        return bahnhofStationRepository.save(bahnhofStation);
    }

    @DeleteMapping("/{id}")
    public void deleteBahnhofStation(@PathVariable Long id) {
        bahnhofStationRepository.deleteByIdColumn(id);
    }
}