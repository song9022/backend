package com.example.guestbook.repository;

import com.example.guestbook.model.GuestbookEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestbookEntryRepository extends JpaRepository<GuestbookEntry, Long> {
}
