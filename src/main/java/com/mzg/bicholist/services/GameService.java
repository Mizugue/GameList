package com.mzg.bicholist.services;

import com.mzg.bicholist.dto.GameMinDTO;
import com.mzg.bicholist.entities.Game;
import com.mzg.bicholist.repositories.GameRepository;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Game> games = gameRepository.findAll();
        return games.stream().map(x -> new GameMinDTO(x)).toList();



    }
}
