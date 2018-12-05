package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;

import com.codeclan.example.WhiskyTracker.models.Whisky;

import java.util.List;

public interface WhiskyRepositoryCustom {

//    custom prototypes

    List<Whisky> findAllWhiskiesForYear(int year);

    List<Whisky> findAllWhiskiesFromRegion(String region);

    List<Whisky> findAllWhiskiesFromDistilleryOFAge(String distilleryName, int age);

}
