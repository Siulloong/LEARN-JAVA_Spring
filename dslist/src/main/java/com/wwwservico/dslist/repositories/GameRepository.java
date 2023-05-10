package com.wwwservico.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wwwservico.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

	
}
