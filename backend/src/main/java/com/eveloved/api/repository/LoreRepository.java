package com.eveloved.api.repository;

import com.eveloved.api.model.LoreEntry;
import org.springframework.data.jpa.JpaRepository;

public interface LoreRepository extends JpaRepository<LoreEntry, Long> {
}
