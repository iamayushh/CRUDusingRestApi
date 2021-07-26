package com.jpa.test.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Department {
@Id
private int DeptId;
private String DeptNAme;
private int DeptCode;
public int getDeptId() {
	return DeptId;
}
public void setDeptId(int deptId) {
	DeptId = deptId;
}
public String getDeptNAme  () {
	return DeptNAme;
}
public void setDeptNAme(String deptNAme) {
	DeptNAme = deptNAme;
}
public int getDeptCode() {
	return DeptCode;
}
public void setDeptCode(int deptCode) {
	DeptCode = deptCode;
}
@Override
public String toString() {
	return "Department [DeptId=" + DeptId + ", DeptNAme=" + DeptNAme + ", DeptCode=" + DeptCode + "]";
}
public Department(int deptId, String deptNAme, int deptCode) {
	super();
	DeptId = deptId;
	DeptNAme = deptNAme;
	DeptCode = deptCode;
}
public Department() {
	super();
	// TODO Auto-generated constructor stub
}

}
