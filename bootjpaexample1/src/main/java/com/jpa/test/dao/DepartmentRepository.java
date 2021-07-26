package com.jpa.test.dao;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jpa.test.entity.Department;






public interface DepartmentRepository extends CrudRepository<Department,Integer>
{

} 
