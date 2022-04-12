package test.userstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import test.userstore.entity.UserRole;
import test.userstore.repositories.UserRoleRepository;

import java.util.List;


@RestController
@RequestMapping("user/roles")
public class UserRoleController {
	
	@Autowired
	private UserRoleRepository userRoleRepository;
//	
//	
//	// build user roles
	@GetMapping
	public List<UserRole> getRoles() {
		return userRoleRepository.findAll();
//		
	}
	
	@PostMapping
	public UserRole postRoles(@RequestBody UserRole userRole ) {
		return userRoleRepository.save(userRole);
	}
}
