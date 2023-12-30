package com.blog.Api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.Api.entities.User;

public interface UserRepo extends JpaRepository<User,Integer> {

}
