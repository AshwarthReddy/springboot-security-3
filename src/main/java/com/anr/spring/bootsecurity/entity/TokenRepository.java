package com.anr.spring.bootsecurity.entity;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.net.http.HttpHeaders;
import java.util.List;
import java.util.Optional;

@Repository
public interface TokenRepository extends MongoRepository<Token, String> {
    Optional<Token> findByToken(String jwt);

    List<Token> findAllValidTokenByUser(String id);
}
