package net.javadsorthiy.ems.repository;

import net.javadsorthiy.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository  extends JpaRepository<Employee,Long> {
}
