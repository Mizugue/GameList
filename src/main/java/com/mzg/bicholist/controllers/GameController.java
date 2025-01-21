package com.mzg.bicholist.controllers;

import com.mzg.bicholist.dto.GameMinDTO;
import com.mzg.bicholist.entities.Game;
import com.mzg.bicholist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping("")
    public List<GameMinDTO> findAll(){
        return gameService.findAll();

    }
}
