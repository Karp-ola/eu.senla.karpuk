package myProject;

public class Number {
	
	private String name; 
	private int age;
	private double weight;
	private String height;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setWeight (Double weight) {   // входное значение класс-обертка
		this.weight = weight; 
	}
	public void setHeight(String height) {
		this.height = height;
	}
	
	public String getName(){
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getWeight() {
		return weight;
	}
	public String getHeight() {
		return height;
	}
	
	public static double BodyMassIndex (double weight, String height) {
		double a = Double.parseDouble(height);
		double index = weight/((a/100)*(a/100));
		return index;
	}
}
