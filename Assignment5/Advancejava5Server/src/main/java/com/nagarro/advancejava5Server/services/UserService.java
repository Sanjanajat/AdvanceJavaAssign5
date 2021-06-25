package com.nagarro.advancejava5Server.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.advancejava5Server.entities.User;

@Repository
public interface UserService extends JpaRepository<User, Integer>{

}
