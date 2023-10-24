package com.example.restsimple.controller;

import com.example.restsimple.model.Kunde;
import com.example.restsimple.repository.KundeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/kunden")
public class KundeController {

    @Autowired
    private KundeRepository kundeRepository;

    @GetMapping("/")
    public List<Kunde> getAllKunden() {
        return kundeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Kunde> getKundeById(@PathVariable Long id) {
        return kundeRepository.findByIdColumn(id);
    }

    @PostMapping("/")
    public Kunde createKunde(@RequestBody Kunde kunde) {
        return kundeRepository.save(kunde);
    }

    @PutMapping("/{id}")
    public Kunde updateKunde(@PathVariable Long id, @RequestBody Kunde kunde) {
        kunde.setId(id);
        return kundeRepository.save(kunde);
    }

    @DeleteMapping("/{id}")
    public void deleteKunde(@PathVariable Long id) {
        kundeRepository.deleteByIdColumn(id);
    }
}