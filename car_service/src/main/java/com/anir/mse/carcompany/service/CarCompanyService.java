package com.anir.mse.carcompany.service;

import com.anir.mse.carcompany.entity.CarCompany;
import com.anir.mse.carcompany.repository.CarCompanyRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CarCompanyService {

    @Autowired
    private CarCompanyRepo carCompanyRepo;

    public CarCompany findCarCompanyById(Long carCompanyId){
        log.info("CarCompanyService:findCarCompanyById called!");
        return carCompanyRepo.findByCarCompanyId(carCompanyId);
    }

    public List<CarCompany> findCarCompanyByCode(String carCompanyCode){
        log.info("CarCompanyService:findCarCompanyByCode called!");
        return carCompanyRepo.findByCarCompanyCode(carCompanyCode);
    }

    public CarCompany saveCarCompany(CarCompany carCompany){
        log.info("CarCompanyService:saveCarCompany called!");
        return carCompanyRepo.save(carCompany);
    }

    public List<CarCompany> findCarCompanies(){
        log.info("CarCompanyService:findCarCompanies called!");
        return carCompanyRepo.findAll();
    }
}
