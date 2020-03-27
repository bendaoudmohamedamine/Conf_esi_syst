package com.esi.conf_esi.repos;

import com.esi.conf_esi.entity.Article;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.UUID;
@RepositoryRestResource
public interface ArticleRepo extends JpaRepository<Article, UUID> {
    public List<Article> findByDescContains(String mc) ;
    public List<Article> findByAdmisIsFalse () ;
    public List<Article> findByAdmisIsTrue () ;
}
