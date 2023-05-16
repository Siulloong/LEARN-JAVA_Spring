package com.wwwservico.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wwwservico.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

	
}
