package com.anir.mse.carcompany.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CarCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long carCompanyId;
    private String  carCompanyName;
    private String  carCompanyCountry;
    @Column(unique = true)
    private String  carCompanyCode;
}
