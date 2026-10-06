package com.devjardel.worker.repositories;

import com.devjardel.worker.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  DepartmentRepository extends JpaRepository<Department,Long> {
}
