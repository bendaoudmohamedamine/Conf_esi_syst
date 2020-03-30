package com.esi.conf_esi.service;

import com.esi.conf_esi.entity.Conference;
import com.esi.conf_esi.entity.Sponsor;
import com.esi.conf_esi.repos.ConferenceRepo;
import com.esi.conf_esi.repos.SponsorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class SponsorService {
    @Autowired
    private SponsorRepo sponsorRepo ;
    @Autowired
    private ConferenceRepo conferenceRepo ;
    public Sponsor findOne (UUID id) {
        return sponsorRepo.getOne(id);
    }
    public List<Sponsor> getAllSponsors (){
        return sponsorRepo.findAll();
    }
    public  void saveSponsor (Sponsor sponsor){
        sponsorRepo.save(sponsor);
    }
    public void deleteSponsor (UUID id){
        sponsorRepo.deleteById(id);

    }
    public  void editSponsor (Sponsor sponsor){
        sponsorRepo.save(sponsor);
    }
    public Sponsor findByEmail (String email){
        return sponsorRepo.findByEmail(email);
    }
    public List<Sponsor> findByConference (UUID id){
        Conference conference = conferenceRepo.getOne(id);
        return  (List<Sponsor>) conference.getSponsors();
    }
}
