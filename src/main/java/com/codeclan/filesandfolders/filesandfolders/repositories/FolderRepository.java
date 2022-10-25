package com.codeclan.filesandfolders.filesandfolders.repositories;

import com.codeclan.filesandfolders.filesandfolders.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
