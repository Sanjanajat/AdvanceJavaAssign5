package com.nagarro.advancejava5Server.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nagarro.advancejava5Server.entities.EmployeeDetails;
import com.nagarro.advancejava5Server.entities.User;
import com.nagarro.advancejava5Server.services.EmployeeService;
import com.nagarro.advancejava5Server.services.UserService;

@RestController
@RequestMapping("/employee")
//http://localhost:8081
@CrossOrigin(origins = "*")
public class Controllers {
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private UserService userService;
	
	//authentication
	@PostMapping("/login")
	public boolean login(@RequestBody User user) {
		if(userService.existsById(user.getId())) {
			return true;
		}else {
			return false;
		}
	}
	
	//get all employee
	@GetMapping("/all")
	public String getListEmployee() {
		HashMap<String,List<EmployeeDetails>> map = new HashMap<>();
		map.put("employees", employeeService.findAll());
		ObjectMapper obj = new ObjectMapper();
		String jsonObj="";
		try {
			jsonObj = obj.writeValueAsString(map);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonObj;
	}
	
	//get Single Employee
	@GetMapping("/{id}")
	public EmployeeDetails get(@PathVariable int id) {
		EmployeeDetails employeeObject = employeeService.getOne(id);
		if(employeeObject == null) {
			System.out.println("Employee with "+id+" not found");
		}
		return employeeObject;
	}
	
	//save employee
	@PostMapping
	public EmployeeDetails save(@RequestBody EmployeeDetails employeeObj) {
		return employeeService.save(employeeObj);
	}
	
	//update employee
	@PutMapping
	public EmployeeDetails update(@PathVariable int id, @RequestBody EmployeeDetails employeeObj) {
		EmployeeDetails existingEmployee = employeeService.getOne(id);
		BeanUtils.copyProperties(employeeObj, existingEmployee,"employeeCode");
		return employeeService.saveAndFlush(existingEmployee);
	}
}
