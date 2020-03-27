package com.esi.conf_esi.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.UUID;
@Entity
@Data @ToString
@AllArgsConstructor @NoArgsConstructor
@EqualsAndHashCode
public class Article implements Serializable {
    @Id
    @GeneratedValue
    private UUID id ;
    @NotEmpty(message = "Remplir ce champ svp" )
    //@Size(max = 300 , min = 10 , message = "max 300 et min 10")
    private String desc ;
    private boolean admis ;
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date dateSubmission ;
    @ManyToOne
    private Conference conference ;
    @OneToMany(mappedBy = "article")
    private Collection<Review> reviews ;
}
