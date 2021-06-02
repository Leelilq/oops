package model;

public class BankEmployee {

	private int EmpId;
	private String EmpName;
	private String EmpPwd;
	private String EmpPart;
	private int EmpSalary;
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getEmpPwd() {
		return EmpPwd;
	}
	public void setEmpPwd(String empPwd) {
		EmpPwd = empPwd;
	}
	public String getEmpPart() {
		return EmpPart;
	}
	public void setEmpPart(String empPart) {
		EmpPart = empPart;
	}
	public int getEmpSalary() {
		return EmpSalary;
	}
	public void setEmpSalary(int empSalary) {
		EmpSalary = empSalary;
	}
	public BankEmployee(int empId, String empName, String empPwd, String empPart, int empSalary) {
		super();
		EmpId = empId;
		EmpName = empName;
		EmpPwd = empPwd;
		EmpPart = empPart;
		EmpSalary = empSalary;
	}
	public BankEmployee() {
		super();
	}
	
}
