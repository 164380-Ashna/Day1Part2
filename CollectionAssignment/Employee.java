package CollectionAssignment;

public class Employee {

	String empName;
	int empid;
	double empSalary;

	public Employee(String empName, int empid, double empSalary) {
		super();
		this.empName = empName;
		this.empid = empid;
		this.empSalary = empSalary;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empid=" + empid
				+ ", empSalary=" + empSalary + "]";
	}

}
