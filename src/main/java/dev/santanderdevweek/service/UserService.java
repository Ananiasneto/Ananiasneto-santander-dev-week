package dev.santanderdevweek.service;

import dev.santanderdevweek.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}