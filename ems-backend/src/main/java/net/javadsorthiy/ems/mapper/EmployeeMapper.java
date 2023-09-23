package net.javadsorthiy.ems.mapper;

import net.javadsorthiy.ems.dto.EmployeeDto;
import net.javadsorthiy.ems.entity.Employee;

public class EmployeeMapper {
            public static EmployeeDto mapToEmployeeDto(Employee employee){
                return new EmployeeDto(
                        employee.getId(),
                        employee.getFirstName(),
                        employee.getLastName(),
                        employee.getEmail(),
                        employee.getDepartment().getId()
                );
            }

            public static Employee mapToEmployee(EmployeeDto employeeDto){
                Employee employee =  new Employee();
                employee.setId(employeeDto.getId());
                employee.setFirstName(employeeDto.getFirstName());
                employee.setLastName(employeeDto.getLastName());
                employee.setEmail(employeeDto.getEmail());
                return employee;
            }
}
