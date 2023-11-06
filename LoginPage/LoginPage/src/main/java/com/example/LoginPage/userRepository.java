package com.example.LoginPage;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface userRepository extends CrudRepository<User,Long> {
}
