package com.example.practical1;

import com.example.practical1.models.PlantInventoryEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantInventoryEntryRepository extends
        JpaRepository<PlantInventoryEntry, Long> {
}
