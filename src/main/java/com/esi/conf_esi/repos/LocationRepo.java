package com.esi.conf_esi.repos;


import com.esi.conf_esi.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Collection;
import java.util.List;
import java.util.UUID;
@RepositoryRestResource
public interface LocationRepo extends JpaRepository<Location, UUID> {
    public List<Location> findByNomContains(String mc);



}
