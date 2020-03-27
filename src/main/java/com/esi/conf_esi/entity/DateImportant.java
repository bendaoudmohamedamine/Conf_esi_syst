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
@AllArgsConstructor @NoArgsConstructor
@Data @ToString @EqualsAndHashCode
public class DateImportant implements Serializable {
    @Id
    @GeneratedValue
    private UUID id ;
    @NotEmpty
    @Size(max = 200)
    private String desc ;
    @Temporal(value = TemporalType.DATE)
    private Date dateImportant ;
    @ManyToOne
    private Conference conference  ;


}
