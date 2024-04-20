package com.samsung.spring.service;

import com.samsung.spring.domain.Landmark;

import java.util.List;

public interface LandmarkService {
    Landmark add(Landmark landmark);

    List<Landmark> getAll();

    Landmark getById(Integer id);

    Landmark update(Integer id, Landmark user);

    void deleteById(Integer id);
}
