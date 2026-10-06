package com.devjardel.worker.config;

import com.devjardel.worker.entities.Department;
import com.devjardel.worker.entities.HourContract;
import com.devjardel.worker.entities.Worker;
import com.devjardel.worker.entities.WorkerLevel;
import com.devjardel.worker.repositories.DepartmentRepository;
import com.devjardel.worker.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

@Configuration
public class SeedingConfig implements CommandLineRunner {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private WorkerRepository workerRepository;

    @Transactional
    @Override
    public void run(String... args) throws Exception {


        Department dept = new Department("Design");
        dept = departmentRepository.save(dept);

        Worker worker = new Worker("Alex", 1200.0, dept, WorkerLevel.MID_LEVEL);

        HourContract contract1 = new HourContract(LocalDate.of(2018, 8, 20), 50.0, 20);
        HourContract contract2 = new HourContract(LocalDate.of(2018, 6, 13), 30.0, 18);
        HourContract contract3 = new HourContract(LocalDate.of(2018, 8, 25), 80.0, 10);

        worker.addContract(contract1);
        worker.addContract(contract2);
        worker.addContract(contract3);
        workerRepository.save(worker);


    }
}
