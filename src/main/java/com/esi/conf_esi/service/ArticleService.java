package com.esi.conf_esi.service;

import com.esi.conf_esi.entity.Article;
import com.esi.conf_esi.entity.Conference;
import com.esi.conf_esi.repos.ArticleRepo;
import com.esi.conf_esi.repos.ConferenceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ArticleService {
    @Autowired
    ArticleRepo articleRepo ;
    @Autowired
    ConferenceRepo conferenceRepo ;
    public Article saveArticle (Article article){
        return  articleRepo.save(article);
    }
    public void editArticle (UUID id , Article article){
        articleRepo.save(article);
    }
    public void deleteArticle (UUID id){
        articleRepo.deleteById(id);
    }
    public List<Article> getAll (){
        return articleRepo.findAll();
    }
    public List<Article> getAdmis (){
        return articleRepo.findByAdmisIsTrue();
    }
    public  List<Article> getNonAdmis (){
        return articleRepo.findByAdmisIsFalse();
    }
   public  List<Article> getArticleByConference (UUID id){
        Conference conference = conferenceRepo.getOne(id);
        return  (List)conference.getArticles();

    }
}
