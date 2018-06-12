package com.portal.service;

import com.portal.domain.User;
import com.portal.domain.security.UserRole;

import java.util.Set;


public interface UserService {
	User createUser(User user, Set<UserRole> userRoles) throws Exception;
	
	User save(User user);
}
