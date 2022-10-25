package com.codeclan.filesandfolders.filesandfolders.repositories;

import com.codeclan.filesandfolders.filesandfolders.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
