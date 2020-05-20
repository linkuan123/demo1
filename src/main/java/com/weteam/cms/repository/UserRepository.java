package com.weteam.cms.repository;

import com.weteam.cms.modal.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
