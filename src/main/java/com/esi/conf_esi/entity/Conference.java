package com.esi.conf_esi.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.UUID;

@Entity @AllArgsConstructor @NoArgsConstructor @Data @ToString
@EqualsAndHashCode
public class Conference implements Serializable {
    @Id
    @GeneratedValue
    private UUID id ;
    @NotEmpty(message = "Remplir ce champ svp")
    @Size(max = 50)
    private String titre ;
    @Temporal(value = TemporalType.DATE)
    private Date start ;
    @Temporal(value = TemporalType.DATE)
    private Date end ;
    @NotEmpty(message = "Remplir ce champ svp")
    @Size(max = 200)
    private String desc ;
    @NotEmpty(message = "Remplir ce champ svp")
    private String covImage ;
    @ManyToOne
    private Location location ;
    @ManyToMany
    private Collection<Specialite> specialites ;
    @OneToMany(mappedBy = "conference")
    private  Collection<Sponsor> sponsors ;
    @OneToMany(mappedBy = "conference")
    private  Collection<Article> articles ;
    @OneToMany(mappedBy = "conference")
    private Collection<DateImportant> dateImportants ;



}
