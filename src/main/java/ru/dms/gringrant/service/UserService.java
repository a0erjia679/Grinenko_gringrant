package ru.dms.gringrant.service;

import ru.dms.gringrant.model.User;

import java.util.List;

public interface UserService {
    public List<User> findAll();
    public User findById(Long id);
    public User save(User holiday);
    public void delete(Long id);
}
