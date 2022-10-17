package com.example.demopatiensdentins;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/patiens")
public class PatiensController {

    private final PatiensService patiensService;
    PatiensRepository repo;

    @Autowired

    public PatiensController(PatiensService patiensService) {
        this.patiensService = patiensService;
    }

    @GetMapping
    public List<Patiens> getPatiens(){
        return patiensService.getPatiens();
    }

    @PostMapping
    public void addPatiens(@RequestBody Patiens patiens){
        patiensService.addPatiens(patiens);
    }

    @DeleteMapping(path = "{patiens}")
    public void deletePatiens(@PathVariable("patiens") Long patiensId){
        patiensService.deletePatiens(patiensId);
    }

    @PutMapping
}
