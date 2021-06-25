package com.nagarro.advancejava5Server.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.advancejava5Server.entities.EmployeeDetails;

@Repository
public interface EmployeeService extends JpaRepository<EmployeeDetails,Integer> {

}
