package com.anir.mse.factory.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Factory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long factoryId;
    @Column(nullable = false)
    private String factoryName;
    @Column(nullable = false, length = 50)
    private String factoryAddressLine1;
    @Column(length = 50)
    private String factoryAddressLine2;
    private String factoryCity;
    @Column(nullable = false, length = 20)
    private String factoryCountry;
    @Column(length = 10)
    private int factoryPin;
    @Column(length = 12)
    private int factoryPhone;
    @Column(unique = true)
    private String factoryCode;
}
