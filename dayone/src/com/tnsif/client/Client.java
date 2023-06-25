package com.tnsif.client;
import com.tnsif.entities.Employee;
import com.tnsif.service.EmployeeService;
import com.tnsif.service.EmployeeServiceImpl;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService service=new EmployeeServiceImpl();
		Employee emp=new Employee();
		
		//create
		/*emp.setId(102);
		emp.setName("Aishwarya Shinde");
		service.createEmployee(emp);
		System.out.println("The data added successfully in the database");
		*/
		
		//update
		/*emp=service.retrieveEmployee(101);
		emp.setName("Parag G");
		service.updateEmployee(emp);
		System.out.println("The data updated successfully in the database");*/
		
		//delete
		/*emp=service.retrieveEmployee(101);
		service.removeEmployee(emp);
		System.out.println("The data deleted successfully from the database");
		 */
		
		//retrieve
		emp=service.retrieveEmployee(102);
		System.out.println("Emp ID: "+emp.getId());
		System.out.println("Emp Name: "+emp.getName());


	}

}
