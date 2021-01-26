package task3;

public class Cat {
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public Cat() {
	}
	public Cat(String name, int age) {
		this.name = name;
		this.age = age; 
	}
	
		
	public String toString() {
		return "Name is " + name + " and age is " + age; 
	}

}
