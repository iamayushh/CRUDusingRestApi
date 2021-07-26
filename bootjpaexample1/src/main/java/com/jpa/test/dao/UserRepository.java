package com.jpa.test.dao;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jpa.test.entity.Employee;






public interface UserRepository extends CrudRepository<Employee,Integer>
{
//public List<Employee> findByFirstName(String name);
	
	///  <-----------------These Are Some of THE customized Querry>
	//findByNameStartingWith(String prefix);
	//findByNameEndingWith(String suffix);
	//findByNameContaining(String words);
	//findByNameLike(String likePatern);
	//findByAgeLessThan(int age);
	//findByAgeGraeterThanEqualTo(int age);
	//findByAgeIn(Collection of IOnteger);
	//findByNameOrderByName(tring name);
} 
