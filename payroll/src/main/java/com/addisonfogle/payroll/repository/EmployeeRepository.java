package com.addisonfogle.payroll.repository;

import com.addisonfogle.payroll.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
