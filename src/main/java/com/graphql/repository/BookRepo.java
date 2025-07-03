package com.graphql.repository;

import com.graphql.entity.Book;
import com.arangodb.springframework.repository.ArangoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends ArangoRepository<Book, String> {
}
