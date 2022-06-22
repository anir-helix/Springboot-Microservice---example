package com.anir.mse.carcompany.controller;

import com.anir.mse.carcompany.entity.CarCompany;
import com.anir.mse.carcompany.service.CarCompanyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car/company")
@Slf4j
public class CarCompanyController {

    @Autowired
    private CarCompanyService carCompanyService;

    @PostMapping("/")
    public CarCompany saveCompany(@RequestBody CarCompany carCompany){
        log.info("Inside saveCompany of CarCompanyController.");
        return carCompanyService.saveCarCompany(carCompany);
    }

    @GetMapping("/code/{code}")
    public List<CarCompany> findCompanyCode(@PathVariable("code") String companyCode){
        log.info("Inside findCompanyCode of CarCompanyController.");
        if(companyCode.equals("ALL")){
            return carCompanyService.findCarCompanies();
        }else {
            return carCompanyService.findCarCompanyByCode(companyCode);
        }
    }

    @GetMapping("/{id}")
    public CarCompany findCompanyById(@PathVariable("id") Long id){
        log.info("Inside findCompanyCode of CarCompanyController.");
        return carCompanyService.findCarCompanyById(id);
    }
}
