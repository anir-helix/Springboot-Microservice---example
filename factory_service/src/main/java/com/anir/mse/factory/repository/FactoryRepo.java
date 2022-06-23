package com.anir.mse.factory.repository;

import com.anir.mse.factory.entity.Factory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FactoryRepo extends JpaRepository<Factory, Long> {
    Factory findByFactoryId(Long factoryId);
    List<Factory> findByFactoryCode(String carCompanyCode);
}
