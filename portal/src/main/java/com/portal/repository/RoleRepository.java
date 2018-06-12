package com.portal.repository;

import com.portal.domain.security.Role;
import org.springframework.data.repository.CrudRepository;


public interface RoleRepository extends CrudRepository<Role, Long> {
	Role findByname(String name);
}
