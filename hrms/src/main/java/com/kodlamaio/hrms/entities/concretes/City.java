package com.kodlamaio.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name="cities")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisement"})

public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="city_name")
    private String cityName;

    @OneToMany(mappedBy = "city")
    @JsonIgnore
    private List<JobAdvertisement> jobAdvertisements;

}
