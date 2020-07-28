package com.techreloded.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// TODO: Auto-generated Javadoc
/**
 * The Class Aliean.
 */
@Component
public class Aliean {
	
	@Override
	public String toString() {
		return "Aliean [aid=" + aid + ", aname=" + aname + ", lap=" + lap + "]";
	}

	private int aid;
	
	private String aname;
	
	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	@Autowired
	Laptop lap;
	
	/**
	 * Code.
	 */
	public void code() {
		System.out.println("Code method is called under aliean class....");
		lap.compile();
		
	}
}
