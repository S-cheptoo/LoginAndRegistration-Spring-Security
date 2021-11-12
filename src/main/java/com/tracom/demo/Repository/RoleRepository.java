package com.tracom.demo.Repository;

import com.tracom.demo.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    @Query("SELECT r FROM Role r WHERE r.id=?1")
    Optional<Role> findById(Integer id);

}