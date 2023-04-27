package com.przychocki.activedirectorybackend.dto;

import com.nimbusds.jose.shaded.json.annotate.JsonIgnore;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class PlayerDTO {
    private long id;
    private String name;
    private String surname;
    private long number;
    private String team;
}
