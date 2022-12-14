package com.test.test.repository;

import com.test.test.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findAllByIsDeleted(boolean isDelete);
}
