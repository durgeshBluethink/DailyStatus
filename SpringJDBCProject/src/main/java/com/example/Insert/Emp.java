package com.example.Insert;

import java.sql.Date;

public class Emp {
    private int empId;
	private String empName;
    private String empEmail;
    private String city;
    private int date;

    public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
    public int getDate() {
		return date;
	}

	public void setDate(int i) {
		this.date = i;
	}

	public String getEmpName() {
        return empName;
    }

    public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

 


	public Emp(int empId, String empName, String empEmail, String city, int date) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.city = city;
		this.date = date;
	}

	public Emp() {
    }

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail + ", city=" + city + ", date="
				+ date + "]";
	}




    
}
