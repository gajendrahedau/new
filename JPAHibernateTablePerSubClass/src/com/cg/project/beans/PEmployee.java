package com.cg.project.beans;

import javax.persistence.Entity;

@Entity
public class PEmployee extends Employee{
private int hra,da,ta;
	
	

	public PEmployee() {
	super();
}

	public PEmployee(int hra, int da, int ta) {
		super();
		this.hra = hra;
		this.da = da;
		this.ta = ta;
	}

	public int getHra() {
		return hra;
	}

	public void setHra(int hra) {
		this.hra = hra;
	}

	public int getDa() {
		return da;
	}

	public void setDa(int da) {
		this.da = da;
	}

	public int getTa() {
		return ta;
	}

	public void setTa(int ta) {
		this.ta = ta;
	}
	
	
	
	
}
