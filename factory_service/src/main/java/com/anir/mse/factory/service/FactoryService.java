package com.anir.mse.factory.service;

import com.anir.mse.factory.entity.Factory;
import com.anir.mse.factory.repository.FactoryRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class FactoryService {
    @Autowired
    private FactoryRepo factoryRepo;

    public Factory saveFactory(Factory factory){
        return factoryRepo.save(factory);
    }
    public Factory findFactoryById(Long factoryId){
        log.info("FactoryService:findFactoryById called!");
        return factoryRepo.findByFactoryId(factoryId);
    }

    public List<Factory> findFactoryByCode(String factoryCode){
        log.info("FactoryService:findFactoryByCode called!");
        return factoryRepo.findByFactoryCode(factoryCode);
    }


    public List<Factory> findFactories(){
        log.info("FactoryService:findCarCompanies called!");
        return factoryRepo.findAll();
    }
}
