package com.jpa.test;
import com.jpa.test.entity.*;

import java.util.*;

import com.jpa.test.dao.*;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Bootjpaexample1Application {

	public static void main(String[] args) {
		ApplicationContext context=	SpringApplication.run(Bootjpaexample1Application.class, args);
		UserRepository userRepository=context.getBean(UserRepository.class);
		DepartmentRepository departmentrepository=context.getBean(DepartmentRepository.class);
				
		           //   Createing Table
	//	<-------------------------------------------------------------->//
		
		Employee emp1=new Employee();
		emp1.setID(101);
		emp1.setFirstName("Ayush");
		emp1.setLastName("Awasthi");
		emp1.setFathersName("Ajay");
		emp1.setAdress("Lucknow");
		emp1.setStatus("Intern");		
		
		Employee emp2=new Employee();
		emp2.setID(102);
		emp2.setFirstName("Ram");
		emp2.setLastName("Awasthi");
		emp2.setFathersName("Prabhat");
		emp2.setAdress("Delhi");
		emp2.setStatus("Puthon Programer");
		
		Employee emp3=new Employee();
		emp3.setID(103);
		emp3.setFirstName("Shyam");
		emp3.setLastName("Awasthi");
		emp3.setFathersName("Prabhat");
		emp3.setAdress("Mumbai");
		emp3.setStatus("Java Programer");

		//To save Multiple object
		ArrayList<Employee> emp=new ArrayList<>();
		emp.add(emp1);
		emp.add(emp2);
		emp.add(emp3);
		Iterable<Employee> result=new ArrayList<>();
				
			result=	userRepository.saveAll(emp);
			
			result.forEach(value->{
				System.out.println(value);
			});
			
			
	           //   Update Table
//	<-------------------------------------------------------------->//
Optional<Employee> optional=userRepository.findById(102);


Employee employeenameupdate=optional.get();
employeenameupdate.setFirstName("Aman");
userRepository.save(employeenameupdate);
		
              //Get the Data Of Employees 


//<-------------------------------------------------------------->//
//Find By Id
Optional<Employee> optionalData=userRepository.findById(102);
Employee empdata=optionalData.get();
System.out.println(empdata);
//Get All the Details of Employee

System.out.println("All value is");

 Iterable<Employee> itr=  userRepository.findAll();
 itr.forEach(user->{System.out.println(user); });
 
 
 //DeleteEmployees
 //<-------------------------------------------------------------->//
 
 userRepository.deleteById(103);
 System.out.println("Elements Deleted");
 
 
 //Using our Custom Querry
 
//   List <Employee> data= userRepository.findByFirstName("Ayush");
//   data.forEach(value->{System.out.println("Value");});
//		}
//	}
 
 
 
// <-------------------------Addding Data Into The Department Table----------------------->
 Department dep1=new Department();
		dep1.setDeptCode(5001);
		dep1.setDeptNAme("IT"); 
		dep1.setDeptId(101);
		Department dep11=departmentrepository.save(dep1);
	
	
	}}
