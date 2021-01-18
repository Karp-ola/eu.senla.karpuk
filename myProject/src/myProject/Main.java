package myProject;

public class Main {
	
	public static void main(String[] args) {
	
		Number one = new Number();
		one.setName("Bob");
		one.setAge((byte)24);
		one.setWeight(75.8);
		one.setHeight("182");
		long weight1 = (long)one.getWeight();  
		int height1 = Integer.parseInt(one.getHeight());
		System.out.println("Name: " + one.getName() + "; Age: " + one.getAge() + "; Weight: " + weight1 + "; Height: " + height1 + "; Body Mass Index: " + one.BodyMassIndex(one.getWeight(), one.getHeight()));
		
		Number two = new Number();
		two.setName("Kate");
		two.setAge((byte)25);
		two.setWeight(58.3);
		two.setHeight("173");
		short weight2 = (short)two.getWeight();
		System.out.println("Name: " + two.getName() + "; Age: " + two.getAge() + "; Weight: " + weight2 + "; Height: " + two.getHeight() + "; Body Mass Index: " + two.BodyMassIndex(two.getWeight(), two.getHeight()));
	

		int int1 = 500;
		byte byte1 = (byte)int1;
		System.out.println(byte1);  // -12 (����� �������� ��������������, �������� byte (-128;127), ����� 500 ��� ����� ���������) 500 - 256 = 244 � 244 - 256 = -12  
		
		byte byte2 = 55;
		int int2 = (int)byte2;
		int int3 = byte2;
		System.out.println(int2);  // 55 (����� ����������� ��������������)
		System.out.println(int3);  // 55 (������� �������������� ���������� �������������) 

		double double1 = 45.9879;
		int int4 = (int)double1;
		int int5 = (int)Math.round(double1);
		System.out.println(int4);   // 45 (�������� ������� ����� ��� ����������)
		System.out.println(int5);   // 46 (��� �������� ������� ����� ��������� ����������)
		
		
		char ch = '4';
		int int6 = (int)ch;
		System.out.println(int6);  // 52 (������ '4' �������������� � ������ ���� 52) 
		
		
		String st = "5";
		int in = Integer.parseInt(st);
		System.out.println(in);
		
		int q = 34;
		double w = Double.valueOf(q);
		double w1 = (double)q;
		System.out.println(w); 
		System.out.println(w1);
		
	    int i1 = 100;
		Integer i2 = 100;
		Integer i22 = 100; 
		Integer i3 = new Integer(100);
		Integer i4 = new Integer(100);
		
		System.out.println(i1==i2);   // true (�.�. ���������� ���������� Integer i2 = 100 � ����������� ��� �������� int);
		System.out.println(i1==i3);   // true (�.�. ���������� ���������� Integer i3 = new Integer(100) � ����������� ��� �������� int);
		System.out.println(i2==i3);   // false (�.�. ������������ ��� ������ �� ������ �������); 
		System.out.println(i3==i4);   // false (�.�. ������������ ��� ������ �� ������ �������); 
		System.out.println(i2==i22);
		
		System.out.println(i2.equals(i3));
		System.out.println(i3.equals(i4));
		System.out.println(i4.equals(i1));
	
		
		
		float f1 = 2.5f;
		double d1 = 2.5;
		float f2 = 2.4f;
		double d2 = 2.4;
		
		System.out.println(f1 == d1);  // true (��������� ������� �� ����� ����� �����, ���� ��� .5, .0, .1235 - ��������� true)
		System.out.println(f2 == d2);  // false
		
		
		String s1 = "I love Java";
		String s2 = "I love Java";
		String s3 = new String ("I love Java");
		String s4 = new String ("I love Java");
		String s5 = "I LOVE JAVA";
		String s6 = new String ("I LOVE JAVA");
		
		System.out.println(s1==s2);   // true (s1 � s2 c�������� ��  ���� � �� �� ������ � ���� �����) 
		System.out.println(s1==s3);   // false (�������� new ��������� �������� ������ �������, �� ������ �� ��, ��� ����� ������ ��� ������� � ���� �����)
		System.out.println(s3==s4);   // false (��� ������ ������ �� ��� ������ �������)
		System.out.println(s1==s5);   // false (������ case)
		System.out.println(s5==s6);   // flse (���������� ��������� s1==s3, �������� new ������� ����� ������)
		
		System.out.println(s1.equals(s2));  // true (���������� ����������)
		System.out.println(s1.equals(s3));  // true (����� ��������� ���������� �������, � �� ������ �� ������)
		System.out.println(s3.equals(s4));  // true (���������� ����������)
		System.out.println(s1.equals(s5));  // false (������ case)
		System.out.println(s5.equals(s6));  // true (���������� ����������)
		
		System.out.println(s1.equalsIgnoreCase(s5)); // true (equalsIgnoreCase ���������� ����������, ��������� Case)
		 
	}

}
