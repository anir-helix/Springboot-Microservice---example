package com.anir.mse.factory.controller;

import com.anir.mse.factory.entity.Factory;
import com.anir.mse.factory.service.FactoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car/factory")
@Slf4j
public class FactoryController {

    @Autowired
    private FactoryService factoryService;
    
    @PostMapping("/")
    public Factory saveFactory(@RequestBody Factory carFactory){
        log.info("Inside saveFactory of CarFactoryController.");
        return factoryService.saveFactory(carFactory);
    }

    @GetMapping("/code/{code}")
    public List<Factory> findFactoryCode(@PathVariable("code") String factoryCode){
        log.info("Inside findFactoryCode of CarFactoryController.");
        if(factoryCode.equals("ALL")){
            return factoryService.findFactories();
        }else {
            return factoryService.findFactoryByCode(factoryCode);
        }
    }

    @GetMapping("/{id}")
    public Factory findFactoryById(@PathVariable("id") Long id){
        log.info("Inside findFactoryCode of CarFactoryController.");
        return factoryService.findFactoryById(id);
    }
}
