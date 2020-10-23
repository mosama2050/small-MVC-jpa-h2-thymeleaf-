package com.smsm.udemy.repositories;

import com.smsm.udemy.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
