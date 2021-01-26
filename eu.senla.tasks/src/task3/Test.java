package task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Cat>ListOfCats = new ArrayList<>(10);
		List<Cat>ListOfCats2 = new ArrayList<>(10);
		String[] ArrayOfNames = {"Bob", "Barsic", "Viscas", "Oscar", "Crab", "Ricky", "Omar", "Vita", "Kitty", "Lilly"};
		int[] ArrayOfAges = {4,2,1,8,5,7,9,6,1,4};
	
		int num = 0;
	
		while(num<10) {
			Cat catt = new Cat("Milky", 1);
			System.out.println(catt);
			num++;
		}
		
		System.out.println("");
		
		for (int i = 0 ; i<10; i++) {
			Cat cat = new Cat();
			cat.setName(ArrayOfNames[i]);
			cat.setAge(ArrayOfAges[i]);
			ListOfCats.add(cat);
			System.out.println("Name is " + cat.getName() + " and age is " + cat.getAge());
			if(i>1) {
				System.out.println("is equals " + ListOfCats.get(i-1) + " " + ListOfCats.get(i).equals(ListOfCats.get(i-1))); 
			}
		}
		System.out.println(ListOfCats); 
		
		
		System.out.println("");
		
		
		num = 0; 
		do {
			 Cat cat1 = new Cat(ArrayOfNames[num], ArrayOfAges[num]); 
			 ListOfCats2.add(cat1);  
			 System.out.println("Name is " + cat1.getName() + " and age is " + cat1.getAge());
			 num++;
		}
		while(num<10);
		
		System.out.println(ListOfCats2); 
		
		
		System.out.println("");
		
		num = 0;
		Cat[] cats = new Cat[5];;
		cats[0] = new Cat("Big", 2);
		cats[1] = new Cat ("Fluffy", 1);
		cats[2] = new Cat("Wild", 5);
		cats[3] = new Cat("Bingo", 6);
		cats[4] = new Cat("Kola", 4);
		
		for(Object item : cats) {
			System.out.println("Name is " + cats[num].getName() + " and age is " + cats[num].getAge());
			if(num>=1) {
				System.out.println("is equals " + cats[num-1].getName() + " " + cats[num].equals(cats[num-1])); 
			}
			num++;
		}
		System.out.println(Arrays.toString(cats));
	}

}
