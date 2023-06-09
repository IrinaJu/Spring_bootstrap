package ru.pg.spring.boot_security.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.pg.spring.boot_security.demo.model.Role;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findRoleByName(String roleName);
}

