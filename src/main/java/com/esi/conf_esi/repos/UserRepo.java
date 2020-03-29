package com.esi.conf_esi.repos;

import com.esi.conf_esi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;
@RepositoryRestResource
public interface UserRepo extends JpaRepository<User, UUID> {
    public User findByEmail(String email);
}
