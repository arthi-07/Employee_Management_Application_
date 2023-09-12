package Project_Employee_Management_Application;

public interface EmployeeDaoIntrf
{
	//create employee
	public void createEmployee(Employee emp);
	//show all employee
	public void showAllEmployee();
	//show employee based on id
	public void showEmployeeBasedOnId(int empid);
	//update  employee
	public void updateEmployee(int id,String name);
	//delete emloyee
	public void deleteEmployee(int id);
	
}
