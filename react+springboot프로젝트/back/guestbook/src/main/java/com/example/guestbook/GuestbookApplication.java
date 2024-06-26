package com.example.guestbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.example.guestbook.model")
public class GuestbookApplication {
    public static void main(String[] args) {
        SpringApplication.run(GuestbookApplication.class, args);
    }
}
