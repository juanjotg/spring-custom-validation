package com.softtek.beca2019.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softtek.beca2019.dao.UsersDao;
import com.softtek.beca2019.model.User;
import com.softtek.beca2019.validation.annotation.UniqueLogin;

@RestController
@RequestMapping("v0/users")
@Validated
public class UserController {

	@Autowired
    private UsersDao usersRepository;

	@GetMapping
    public void readAll() {
				
		usersRepository.readAll();
    }
	
    @PostMapping
    public User create(@RequestBody(required = false) @Valid @UniqueLogin User user) {    	    	
    	
    	return usersRepository.create(user);
    	
    }

}
