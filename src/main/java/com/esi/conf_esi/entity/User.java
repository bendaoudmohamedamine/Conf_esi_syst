package com.esi.conf_esi.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.UUID;

@Entity @Data
@AllArgsConstructor @NoArgsConstructor
@ToString @EqualsAndHashCode
public class User implements Serializable {
    @Id
    @GeneratedValue
    private UUID id ;
    private String nom ;
    private String prenom ;
    private String email ;
    private String pwd ;




}
