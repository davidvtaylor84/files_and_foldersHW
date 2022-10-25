package com.codeclan.filesandfolders.filesandfolders.repositories;

import com.codeclan.filesandfolders.filesandfolders.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
