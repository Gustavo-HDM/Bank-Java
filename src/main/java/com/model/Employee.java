package com.model;

public class Employee extends Person{
	
	private Double salary;
	private String function;
	private boolean status;
	private static final String NACIONALITY = "Brasileiro";
	
	public Employee() {}
	
	public Employee(String name, String city, int age, String cpf) {
		super(name, city, age, cpf);
	}

	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getFunction() {
		return function;
	}
	public void setFunction(String function) {
		this.function = function;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		
		return "Nome: " + super.getName() +
				"\nIdade: " + super.getAge() +
				"\nCidade: " + super.getCity() +
				"\nFuncao: " + getFunction() + 
				"\nSalario: " + getSalary() +
				"\nNacionalidade: " + Employee.NACIONALITY;
	}
}
