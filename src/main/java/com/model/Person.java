package com.model;

public abstract class Person {

	private String name;
	private String city;
	private int age;
	private String cpf;
	
	public Person() {}
	
	public Person(String name, String city, int age, String cpf) {
		super();
		this.name = name;
		this.city = city;
		this.age = age;
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
