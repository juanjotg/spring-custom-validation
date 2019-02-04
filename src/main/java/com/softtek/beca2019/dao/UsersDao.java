package com.softtek.beca2019.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.softtek.beca2019.model.User;

@Repository
public class UsersDao {
	
	private Map<String, User> registeredUsers = new HashMap<String, User>();
	
	
	public User create(User user) {		
				
		user.setId(UUID.randomUUID().toString());
		
		registeredUsers.put(user.getId(), user);	
		
		return readOne(user.getId());
	}

	public User readOne(String userId) {
		
		return registeredUsers.get(userId);			
		
	}
	
	
	public List<User> readAll() {
		
		return new ArrayList<User>(registeredUsers.values());
	}
		
}
