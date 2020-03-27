package com.esi.conf_esi.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.UUID;
@Entity
@AllArgsConstructor @NoArgsConstructor
@Data @ToString @EqualsAndHashCode
public class Sponsor implements Serializable {
    @Id
    @GeneratedValue
    private UUID id ;
    @NotEmpty(message = "Remplir ce champ svp")
    private String nom ;
    private String email ;
    @NotEmpty(message = "Remplir ce champ svp")
    private String lien ;
    @ManyToOne
    private Conference conference ;
}
