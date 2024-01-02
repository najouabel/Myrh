package com.app.myrhh.controllers;

import com.app.myrhh.dto.RegisterRequest;
import com.app.myrhh.models.Company;
import com.app.myrhh.services.CompanyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;

@RestController
public class CompanyController {

    private Company company;
    private final CompanyService companyService;


    public CompanyController( CompanyService companyService) {
        this.companyService = companyService;
    }

    @PostMapping("/register")
    public ResponseEntity<Object> registration(@RequestBody RegisterRequest req){
        company = new Company(req.getName(), req.getLogin(), req.getPassword(), req.getEmail(), req.getPhone(), req.getAddress(), req.getImageUrl());
       companyService.save(company);
        return ResponseEntity.ok(company);
    }


    @GetMapping("/company/all")
    public ResponseEntity<Object> all(){
        return ResponseEntity.ok(companyService.listAll());
    }
}
