package com.esi.conf_esi.service;
import com.esi.conf_esi.entity.Conference;
import com.esi.conf_esi.entity.Specialite;
import com.esi.conf_esi.repos.ConferenceRepo;
import com.esi.conf_esi.repos.SpecialiteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class SpecialiteService {
    @Autowired
    private SpecialiteRepo specialiteRepo ;
    @Autowired
    private ConferenceRepo conferenceRepo ;
    public Specialite getSpec (UUID id){
        return specialiteRepo.getOne(id);
    }
    public List<Specialite> getAllSpecs (){
        return specialiteRepo.findAll() ;
    }
    public List<Specialite> finSpecsByConf (UUID id){
        Conference conference = conferenceRepo.getOne(id);
        return (List) conference.getSpecialites();
    }
    public void addSpec (Specialite specialite){
        specialiteRepo.save(specialite);
    }
    public void editSpec (Specialite specialite){
        specialiteRepo.save(specialite);
    }
    public void deleteSpec (UUID id){
        specialiteRepo.deleteById(id);
    }

}
