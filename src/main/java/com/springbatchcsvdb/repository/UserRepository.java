package com.springbatchcsvdb.repository;

import com.springbatchcsvdb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
