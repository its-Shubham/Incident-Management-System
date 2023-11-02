package com.ims.incident_management_system.Reposority;

import com.ims.incident_management_system.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}
