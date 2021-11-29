package com.notSlots.Random.Picker.repositories;

import com.notSlots.Random.Picker.models.GameState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameStateRepository extends JpaRepository<GameState, Long> {


}
