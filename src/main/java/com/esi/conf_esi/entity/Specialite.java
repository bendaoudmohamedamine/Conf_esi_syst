package com.esi.conf_esi.entity;
import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Collection;
import java.util.UUID;
@Entity
@AllArgsConstructor @NoArgsConstructor
@Data @ToString @EqualsAndHashCode
public class Specialite implements Serializable {
    @Id
    @GeneratedValue
    private UUID id ;
    @NotEmpty(message = "Remplir ce champ svp")
    private String titre ;
    @ManyToMany
    private Collection<Conference> conferences ;
}
