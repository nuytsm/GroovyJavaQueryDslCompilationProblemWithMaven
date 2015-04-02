package org.nuytsm.GroovyQueryDsl;

import javax.persistence.Basic;
import javax.persistence.Entity;

@Entity
public class SomeJavaEntity {

	@Basic
	private String name;
	
	@Basic
	private int total;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	
}
