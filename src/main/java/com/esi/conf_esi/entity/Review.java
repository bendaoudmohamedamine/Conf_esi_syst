package com.esi.conf_esi.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;
@Entity
@AllArgsConstructor @NoArgsConstructor
@Data @ToString @EqualsAndHashCode
public class Review implements Serializable {
    @Id
    @GeneratedValue
    private UUID id ;
    @Temporal(value = TemporalType.DATE)
    private Date reviewDate ;
    private int note ;
    @NotEmpty(message = "Remplir ce champ svp")
    private String remarque ;
    @ManyToOne
    private Article article ;
}
