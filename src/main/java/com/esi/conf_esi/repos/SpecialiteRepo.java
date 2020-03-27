package com.esi.conf_esi.repos;

import com.esi.conf_esi.entity.Specialite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;
@RepositoryRestResource
public interface SpecialiteRepo extends JpaRepository<Specialite, UUID> {
    @Override
    public Specialite getOne(UUID uuid);
}
