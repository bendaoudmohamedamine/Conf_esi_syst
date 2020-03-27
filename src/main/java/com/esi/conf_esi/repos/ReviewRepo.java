package com.esi.conf_esi.repos;

import com.esi.conf_esi.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Date;
import java.util.UUID;
@RepositoryRestResource
public interface ReviewRepo extends JpaRepository<Review, UUID> {
    public Review findByReviewDate (Date date) ;

}
