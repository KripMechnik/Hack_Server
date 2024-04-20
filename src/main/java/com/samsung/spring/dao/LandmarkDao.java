package com.samsung.spring.dao;

import com.samsung.spring.domain.Landmark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LandmarkDao extends JpaRepository<Landmark, Integer> {
}
