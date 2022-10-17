package com.example.demopatiensdentins;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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


}
