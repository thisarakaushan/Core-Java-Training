package com.highradius.spring;

public class BeanDemo {
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int id;
	public String name;
	
	public DependencyClass dependency;

	public DependencyClass getDependency() {
		return dependency;
	}
	public void setDependency(DependencyClass dependency) {
		this.dependency = dependency;
	}
	
	public String toString() {
		
		return "id: "+id+", name: "+name + ", dependency: "+dependency;
	}

}
