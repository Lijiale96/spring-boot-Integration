package com.firenay.boot.entity;

/**
 * <p>Title: Emp</p>
 * Description：
 * date：2020/5/17 11:58
 */
public class Emp {
	private Integer empId;
	private String empName;
	private Integer empAge;

	public Emp() {
	}

	public Emp(Integer empId, String empName, Integer empAge) {
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
	}


	@Override
	public String toString() {
		return "Emp{" +
				"empId=" + empId +
				", empName='" + empName + '\'' +
				", empAge=" + empAge +
				'}';
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getEmpAge() {
		return empAge;
	}

	public void setEmpAge(Integer empAge) {
		this.empAge = empAge;
	}
}
