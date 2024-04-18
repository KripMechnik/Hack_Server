package com.samsung.spring.service;

import com.samsung.spring.dao.LandmarkDao;
import com.samsung.spring.domain.Landmark;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements LandmarkService {

    private final LandmarkDao landmarkDao;

    @Override
    public Landmark add(Landmark user) {
        return landmarkDao.save(user);
    }

    @Override
    public List<Landmark> getAll() {
        return landmarkDao.findAll();
    }

    @Override
    public Landmark getById(long id) {
        return landmarkDao.findById(id).orElse(null);
    }

    @Override
    public Landmark update(long id, Landmark user) {
        Optional<Landmark> userOptional = landmarkDao.findById(id);
        if (!userOptional.isPresent()) throw new RuntimeException("User with ID " + id + " not found");

        Landmark updateUser = userOptional.get();
        updateUser.setTitle(user.getTitle());
        updateUser.setDescription(user.getDescription());
        updateUser.setImage(user.getImage());

        return landmarkDao.save(user);
    }

    @Override
    public void deleteById(long id) {
        landmarkDao.deleteById(id);
    }
}
