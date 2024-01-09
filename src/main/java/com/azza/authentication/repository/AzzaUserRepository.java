package com.azza.authentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.azza.authentication.model.entity.AzzaUser;

public interface AzzaUserRepository extends JpaRepository<AzzaUser, Long> {

}
