package com.devjardel.worker.repositories;

import com.devjardel.worker.entities.Department;
import com.devjardel.worker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker,Long> {
}
