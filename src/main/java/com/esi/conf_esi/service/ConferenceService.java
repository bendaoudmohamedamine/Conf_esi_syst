package com.esi.conf_esi.service;

import com.esi.conf_esi.entity.Article;
import com.esi.conf_esi.entity.Conference;
import com.esi.conf_esi.entity.Location;
import com.esi.conf_esi.repos.ArticleRepo;
import com.esi.conf_esi.repos.ConferenceRepo;
import com.esi.conf_esi.repos.LocationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ConferenceService {
    @Autowired
    private ConferenceRepo conferenceRepo ;
    @Autowired
    private LocationRepo locationRepo ;
    public void saveConf (Conference conference){
         conferenceRepo.save(conference);
    }
    public  void deletConf (UUID id){
        conferenceRepo.deleteById(id);
    }
    public void editConf(UUID id ,Conference conference){
         conferenceRepo.save(conference);
    }
    /*public List<Conference> getAllbyDate(){
        return conferenceRepo.findAllByOrOrderByStartAsc();
    }*/
    public List<Conference> getAllbyMc (String mc){
        return conferenceRepo.findByTitreContains(mc);
    }
    public Conference getConf (UUID id){
        return conferenceRepo.getOne(id);
    }
    public List<Conference> findByLocation (UUID id){
        Location location =  locationRepo.getOne(id);
        return  (List) location.getConferences();

    }








}
