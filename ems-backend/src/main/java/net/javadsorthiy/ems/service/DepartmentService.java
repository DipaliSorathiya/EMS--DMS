package net.javadsorthiy.ems.service;

import net.javadsorthiy.ems.dto.DepartmentDto;
import net.javadsorthiy.ems.entity.Department;
import java.util.List;

public interface DepartmentService {
    DepartmentDto createDepartment(DepartmentDto departmentDto);

    DepartmentDto getDepartmentById(Long departmentId);

    List<DepartmentDto> getAllDepartments();

    DepartmentDto updateDepartment(Long departmentId,DepartmentDto updatedDepartment);

    void deleteDepartment(Long departmentId);
}
