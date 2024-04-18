package com.samsung.spring.service;

import com.samsung.spring.domain.Landmark;

import java.util.List;

public interface LandmarkService {
    Landmark add(Landmark landmark);

    List<Landmark> getAll();

    Landmark getById(long id);

    Landmark update(long id, Landmark user);

    void deleteById(long id);
}
