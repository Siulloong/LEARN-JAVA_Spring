package com.wwwservico.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wwwservico.dslist.dto.GameMinDTO;
import com.wwwservico.dslist.entities.Game;
import com.wwwservico.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gamerepository;
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gamerepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}

}
