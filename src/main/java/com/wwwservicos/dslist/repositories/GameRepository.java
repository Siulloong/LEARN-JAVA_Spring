package com.wwwservicos.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wwwservicos.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
