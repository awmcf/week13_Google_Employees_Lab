package com.codeclan.googleEmployees.googleEmployees.repositories;

import com.codeclan.googleEmployees.googleEmployees.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {


}
