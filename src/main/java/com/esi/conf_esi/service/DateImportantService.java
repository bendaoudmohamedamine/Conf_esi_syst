package com.esi.conf_esi.service;

import com.esi.conf_esi.entity.Conference;
import com.esi.conf_esi.entity.DateImportant;
import com.esi.conf_esi.repos.ConferenceRepo;
import com.esi.conf_esi.repos.DateImportantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class DateImportantService {
    @Autowired
    private DateImportantRepo dateImportantRepo ;
    @Autowired
    private ConferenceRepo conferenceRepo ;
    public DateImportant getDte (UUID id){
        return dateImportantRepo.getOne(id);
    }
    public void addDate (DateImportant dateImportant){
        dateImportantRepo.save(dateImportant);
    }
    public void editDate (DateImportant dateImportant){
        dateImportantRepo.save(dateImportant);
    }
    public void deleteDate (UUID id){
        dateImportantRepo.deleteById(id);
    }
    public List<DateImportant> getAllDatesByConference (UUID id){
        Conference conference = conferenceRepo.getOne(id);
        return  (List) conference.getDateImportants();
    }
    public List<DateImportant> getAllDatesByMc (String mc){
        return dateImportantRepo.findByDescContains(mc);
    }

}
