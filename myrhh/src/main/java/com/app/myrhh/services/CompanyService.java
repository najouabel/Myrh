package com.app.myrhh.services;

import com.app.myrhh.models.Company;
import com.app.myrhh.repositories.CompanyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    private final CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public Company save(Company company){
        return companyRepository.save(company);
    }

    public List<Company> listAll(){
        return companyRepository.findAll();
    }
}
