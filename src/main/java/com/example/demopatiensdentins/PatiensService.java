package com.example.demopatiensdentins;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatiensService {

    public final  PatiensRepository patiensRepository;

    @Autowired
    public PatiensService(PatiensRepository patiensRepository) {
        this.patiensRepository = patiensRepository;
    }

    public List<Patiens> getPatiens(){
        return patiensRepository.findAll();
    }

    public void addPatiens(Patiens patiens){
        Optional<Patiens> patiensOptional = patiensRepository
                .findPatiensByCedula(patiens.getCedula());
        if(patiensOptional.isPresent()){
            throw new IllegalStateException("Cedula Taken");
        }
        patiensRepository.save(patiens);
    }

    public void deletePatiens(Long patiensId){
        boolean exists = patiensRepository.existsById(patiensId);
        if(!exists){
            throw new IllegalStateException("This patiens with id" + patiensId + " doesn't exits");
        }
        patiensRepository.deleteById(patiensId);
    }



}
