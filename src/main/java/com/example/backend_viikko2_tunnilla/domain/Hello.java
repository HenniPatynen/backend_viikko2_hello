package com.example.backend_viikko2_tunnilla.domain;

public class Hello {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Hello [name=" + name + ", age=" + age + "]";
	}
	public Hello(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
}
