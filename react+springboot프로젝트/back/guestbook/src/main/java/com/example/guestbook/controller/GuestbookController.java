package com.example.guestbook.controller;

import com.example.guestbook.model.GuestbookEntry;
import com.example.guestbook.repository.GuestbookEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/guestbook")
@CrossOrigin(origins = "http://localhost:3000")
public class GuestbookController {

    @Autowired
    private GuestbookEntryRepository repository;

    @GetMapping("/entries")
    public List<GuestbookEntry> getEntries() {
        return repository.findAll();
    }

    @PostMapping("/entries")
    public GuestbookEntry addEntry(@RequestBody GuestbookEntry newEntry) {
        newEntry.setDateCreated(LocalDateTime.now());
        return repository.save(newEntry);
    }

    @DeleteMapping("/entries/{id}")
    public void deleteEntry(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
