package com.esi.conf_esi.service;

import com.esi.conf_esi.entity.Location;
import com.esi.conf_esi.repos.ConferenceRepo;
import com.esi.conf_esi.repos.LocationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class LocationService {
    @Autowired
    private LocationRepo locationRepo ;
    public Location saveLocation (Location location){
        return locationRepo.save(location);
    }
    public  void deleteLocation (UUID id){
        locationRepo.deleteById(id);
    }
    public  void editLocation (UUID id , Location location){
        locationRepo.save(location);
    }
    public List<Location> findByMc (String mc ){
        return  locationRepo.findByNomContains(mc);
    }

}
