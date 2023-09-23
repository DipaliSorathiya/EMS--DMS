package net.javadsorthiy.ems.repository;

import net.javadsorthiy.ems.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
