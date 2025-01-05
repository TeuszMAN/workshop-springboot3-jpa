package com.teusz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teusz.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {



}
