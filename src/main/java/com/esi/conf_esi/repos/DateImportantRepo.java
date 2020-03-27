package com.esi.conf_esi.repos;

import com.esi.conf_esi.entity.DateImportant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.UUID;
@RepositoryRestResource
public interface DateImportantRepo extends JpaRepository<DateImportant, UUID> {
    public List<DateImportant> findByDescContains(String mc) ;

}
