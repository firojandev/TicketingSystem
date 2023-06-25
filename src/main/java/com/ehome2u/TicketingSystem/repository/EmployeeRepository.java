package com.ehome2u.TicketingSystem.repository;


import com.ehome2u.TicketingSystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
