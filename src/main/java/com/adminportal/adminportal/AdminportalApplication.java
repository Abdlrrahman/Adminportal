package com.adminportal.adminportal;

import java.util.HashSet;
import java.util.Set;

import com.adminportal.domain.User;
import com.adminportal.domain.security.Role;
import com.adminportal.domain.security.UserRole;
import com.adminportal.service.UserService;
import com.adminportal.utility.SecurityUtility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {
		org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class })
@ComponentScan("com.adminportal.controller")
@EntityScan("com.adminportal.domain")
public class AdminportalApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(AdminportalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user1 = new User();
		user1.setUsername("admin");
		user1.setPassword(SecurityUtility.passwordEncoder().encode("admin"));
		user1.setEmail("admin@gmail.com");
		Set<UserRole> userRoles = new HashSet<>();
		Role role1 = new Role();
		role1.setRoleId(1);
		role1.setName("ROLE_ADMIN");
		userRoles.add(new UserRole(user1, role1));

		userService.createUser(user1, userRoles);
	}

}
