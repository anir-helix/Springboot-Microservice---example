package com.anir.mse.carcompany.repository;

import com.anir.mse.carcompany.entity.CarCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarCompanyRepo extends JpaRepository<CarCompany, Long> {

    CarCompany findByCarCompanyId(Long carCompanyId);


    List<CarCompany> findByCarCompanyCode(String carCompanyCode);

}
