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
	
	              
	/* <-----------------Custom Query------------->
           How to write custom querry
	@Querry---->JPQL AND SQL
	 Querry(Select * from user)
	public List<Employee> GetallEmployee(String name);
	Parametersized cutom querry
	
	
	@Querry("Select * from user u where u.name:n")
	public List<Employee> getUserByName(@Param("n") String name)
	*/
} 
