package com.colak.springtutorial.repository;


import com.colak.springtutorial.model.Content;
import org.springframework.data.couchbase.repository.ReactiveCouchbaseRepository;

public interface ContentRepository extends ReactiveCouchbaseRepository<Content, Integer> {
}
