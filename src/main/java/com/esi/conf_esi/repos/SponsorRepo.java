package com.esi.conf_esi.repos;

import com.esi.conf_esi.entity.Sponsor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.UUID;
@RepositoryRestResource
public interface SponsorRepo extends JpaRepository<Sponsor, UUID> {
    @Override
    public Sponsor getOne(UUID uuid);
    public List<Sponsor> findByNomContains(String mc);
    public Sponsor findByEmail(String email) ;

}
