package com.smsm.udemy.repositories;

import com.smsm.udemy.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
