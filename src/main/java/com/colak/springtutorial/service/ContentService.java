package com.colak.springtutorial.service;


import com.colak.springtutorial.model.Content;
import com.colak.springtutorial.repository.ContentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Slf4j
@RequiredArgsConstructor
public class ContentService {
    private final ContentRepository repository;

    public Mono<Content> createContent(Content content) {
        return repository.save(content);

    }

    public Flux<Content> getAllContents() {
        return repository.findAll();
    }
}
