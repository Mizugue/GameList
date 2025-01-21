package com.mzg.bicholist.repositories;

import com.mzg.bicholist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
