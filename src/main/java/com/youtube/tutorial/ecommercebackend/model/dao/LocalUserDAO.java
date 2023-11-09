package com.youtube.tutorial.ecommercebackend.model.dao;

import com.youtube.tutorial.ecommercebackend.model.LocalUser;
import org.springframework.data.repository.CrudRepository;

public interface LocalUserDAO extends CrudRepository<LocalUser, Long> {
}
