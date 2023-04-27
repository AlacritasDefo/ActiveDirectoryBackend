package com.przychocki.activedirectorybackend.controller;

import com.przychocki.activedirectorybackend.dto.PlayerDTO;
import com.przychocki.activedirectorybackend.dto.TeamDTO;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/")

@RestController
public class PlayerListController {
    private TeamDTO manchester = TeamDTO.builder().id(1).name("Manchester").build();
    private TeamDTO chelsea = TeamDTO.builder().id(2).name("Chelsea").build();
    private List<PlayerDTO> MANCHESTER_PLAYERS = List.of(
            PlayerDTO.builder().id(1).name("David").surname("De Gea").number(1).team(manchester.getName()).build(),
            PlayerDTO.builder().id(2).name("Diogo").surname("Dalot").number(20).team(manchester.getName()).build(),
            PlayerDTO.builder().id(3).name("Victor").surname("Lindelöf").number(2).team(manchester.getName()).build(),
            PlayerDTO.builder().id(4).name("Harry").surname("Maguire").number(5).team(manchester.getName()).build(),
            PlayerDTO.builder().id(5).name("Aaron").surname("Wan-Bissaka").number(29).team(manchester.getName()).build(),
            PlayerDTO.builder().id(6).name("Christian").surname("Eriksen").number(14).team(manchester.getName()).build(),
            PlayerDTO.builder().id(7).name("").surname("Casemiro").number(18).team(manchester.getName()).build(),
            PlayerDTO.builder().id(8).name("Jadon").surname("Sancho").number(25).team(manchester.getName()).build(),
            PlayerDTO.builder().id(9).name("Bruno").surname("Fernandes").number(8).team(manchester.getName()).build(),
            PlayerDTO.builder().id(10).name("").surname("Antony").number(21).team(manchester.getName()).build(),
            PlayerDTO.builder().id(11).name("Anthony").surname("Martial").number(9).team(manchester.getName()).build()
    );
    private List<PlayerDTO> CHELSEA_PLAYERS = List.of(
            PlayerDTO.builder().id(12).name("Kepa").surname("Arrizabalaga").number(1).team(chelsea.getName()).build(),
            PlayerDTO.builder().id(13).name("Reece").surname("James").number(24).team(chelsea.getName()).build(),
            PlayerDTO.builder().id(14).name("Thiago").surname("Silva").number(6).team(chelsea.getName()).build(),
            PlayerDTO.builder().id(15).name("Benoit").surname("Badiashle").number(4).team(chelsea.getName()).build(),
            PlayerDTO.builder().id(16).name("Marc").surname("Cucurella").number(32).team(chelsea.getName()).build(),
            PlayerDTO.builder().id(17).name("Conor").surname("Gallagher").number(23).team(chelsea.getName()).build(),
            PlayerDTO.builder().id(18).name("Enzo").surname("Fernandez").number(5).team(chelsea.getName()).build(),
            PlayerDTO.builder().id(19).name("Mason").surname("Mount").number(19).team(chelsea.getName()).build(),
            PlayerDTO.builder().id(20).name("Hakim").surname("Ziyech").number(22).team(chelsea.getName()).build(),
            PlayerDTO.builder().id(21).name("Kai").surname("Havertz").number(29).team(chelsea.getName()).build(),
            PlayerDTO.builder().id(22).name("Mykhailo").surname("Mudryk").number(15).team(chelsea.getName()).build()
            );


    @GetMapping(value = "player")
    public List<PlayerDTO> getPlayers() {
        List<PlayerDTO> allPlayers = new ArrayList<>();
        allPlayers.addAll(MANCHESTER_PLAYERS);
        allPlayers.addAll(CHELSEA_PLAYERS);
        return allPlayers;
    }

    @GetMapping("team")
    public List<TeamDTO> allTeams() {
        List<TeamDTO> allTeams = new ArrayList<>();
        manchester.setPlayers(MANCHESTER_PLAYERS);
        chelsea.setPlayers(CHELSEA_PLAYERS);
        allTeams.add(manchester);
        allTeams.add(chelsea);
        return allTeams;
    }


    @GetMapping("player/{id}")
    public PlayerDTO getPlayer(@PathVariable("id") int id) {
        List<PlayerDTO> allPlayers = new ArrayList<>();
        allPlayers.addAll(MANCHESTER_PLAYERS);
        allPlayers.addAll(CHELSEA_PLAYERS);
        return allPlayers.get(id);
    }

    @GetMapping("team/{id}")
    public TeamDTO getTeam(@PathVariable("id") int id) {
        List<TeamDTO> allTeams = new ArrayList<>();
        manchester.setPlayers(MANCHESTER_PLAYERS);
        chelsea.setPlayers(CHELSEA_PLAYERS);
        allTeams.add(manchester);
        allTeams.add(chelsea);
        return allTeams.get(id);
    }


}
