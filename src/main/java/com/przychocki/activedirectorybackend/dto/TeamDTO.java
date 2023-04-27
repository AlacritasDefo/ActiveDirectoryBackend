package com.przychocki.activedirectorybackend.dto;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class TeamDTO {
    private long id;
    private String name;
    private List<PlayerDTO> players;
}
