package com.carbuy;

import com.carbuy.domain.User;
import com.carbuy.domain.security.Role;
import com.carbuy.domain.security.UserRole;
import com.carbuy.service.UserService;
import com.carbuy.utility.SecurityUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class CarbuyApplication implements CommandLineRunner{

	@Autowired
	private UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(CarbuyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user1 = new User();
		user1.setFirstName("leslie");
		user1.setLastName("mccarthy");
		user1.setUsername("leslie");
		user1.setPassword(SecurityUtility.passwordEncoder().encode("leslie"));
		user1.setEmail("leslie.mccarthy@mycit.ie");
		Set<UserRole> userRoles = new HashSet<>();
		Role role1= new Role();
		role1.setRoleId(1);
		role1.setName("ROLE_USER");
		userRoles.add(new UserRole(user1, role1));

		userService.createUser(user1, userRoles);
	}
}
