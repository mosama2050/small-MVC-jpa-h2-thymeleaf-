package com.smsm.udemy.repositories;

import com.smsm.udemy.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository  extends CrudRepository<Author , Long> {
}
