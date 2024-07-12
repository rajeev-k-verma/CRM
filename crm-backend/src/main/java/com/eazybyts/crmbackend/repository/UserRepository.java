package com.eazybyts.crmbackend.repository;

import com.eazybyts.crmbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
