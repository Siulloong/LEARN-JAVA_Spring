package com.wwwservicos.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wwwservicos.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
