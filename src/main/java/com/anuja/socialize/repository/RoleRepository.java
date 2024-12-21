package com.anuja.socialize.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anuja.socialize.entity.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}
