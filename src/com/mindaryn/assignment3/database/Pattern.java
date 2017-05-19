package com.mindaryn.assignment3.database;

public class Pattern {
	private String name, pgroup, implementation;
	private Integer id;
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPgroup(String pgroup) {
		this.pgroup = pgroup;
	}
	
	public void setImplementation(String implementation) {
		this.implementation = implementation;
	}
	
	//----------------------------
	
	public Integer getId() {
		return id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getPgroup() {
		return this.pgroup;	
	}
	
	public String getImplementation(){
		return this.implementation;
	}
	
	//----------------------------	
	
	@Override
	public String toString() {
		return "Pattern [name=" + name + ", id=" + id + ", pgroup=" + pgroup + ", implementation=" + implementation + "]";
	}
	
}
