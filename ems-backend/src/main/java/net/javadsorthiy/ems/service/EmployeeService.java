package net.javadsorthiy.ems.service;

import net.javadsorthiy.ems.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
        EmployeeDto createEmployee(EmployeeDto employeeDto);

        EmployeeDto getEmployeeById(Long employeeId);
        List<EmployeeDto> getAllEmployees();
        EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEMployee);

        void deleteEmployee(Long employeeId);

}
