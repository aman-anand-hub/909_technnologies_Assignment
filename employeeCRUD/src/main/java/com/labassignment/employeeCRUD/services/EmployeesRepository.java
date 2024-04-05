package com.labassignment.employeeCRUD.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.labassignment.employeeCRUD.models.Employee;
import org.springframework.stereotype.Service;

@Service
public interface EmployeesRepository extends JpaRepository<Employee, Integer>{
	// JPA is reading and writing data for us from the DB.
}
