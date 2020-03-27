package com.esi.conf_esi.repos;

import com.esi.conf_esi.entity.Conference;
import com.esi.conf_esi.entity.Specialite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@RepositoryRestResource
public interface ConferenceRepo extends JpaRepository<Conference, UUID> {
    @Override
    public Conference getOne(UUID uuid);
    public List<Conference> findByDescContains(String mc) ;
    public List<Conference> findByStartAfterAndEndBefore(Date st , Date en);
    public Conference findByTitre(String titre);
    public List<Conference> findByTitreContains(String mc) ;


}
