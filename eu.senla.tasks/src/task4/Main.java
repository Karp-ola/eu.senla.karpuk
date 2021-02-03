package task4;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
	
	static Random random = new Random();
	static StringBuilder sb1 = new StringBuilder();     // для хранения обрезанных со 2 по 4 элемент строк и вывода в консоль через запятую 

	
	static String [][] matrix = new String[10][10];
	static final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	static final int lengthOfElement = 6;
	
	public static void main (String[] args) {
		
		for(int i = 0; i<matrix.length; i++ ) {
			for (int j = 0; j<matrix[i].length; j++) {
			if(j%3==0 || j==0) {
			matrix[i][j] = randomDoubleToString();
			}else {
				matrix[i][j] = randomString();
			}			
			System.out.print(matrix[i][j] + " ");
			}
			System.out.println(""); 
			}
		
		String[] diagonal1 = directDiagonal();
		System.out.println(Arrays.toString(diagonal1));
		
		String[] diagonal2 = sideDiagonal();
		System.out.println(Arrays.toString(diagonal2));
				
		compareArrays(diagonal1, diagonal2);
		isNumerical (diagonal1, diagonal2);		
	}	
		
	private static String randomDoubleToString() {
		
		double randomDouble = 10 * random.nextDouble();
		String doubleToString = String.valueOf(randomDouble);
		doubleToString = doubleToString.substring(0,6);
		return doubleToString ;
	}
	
	private static String randomString() {
		
		StringBuilder sb = new StringBuilder();		// для создания строки из шести рамдомных символов
			
		for (int q = 0; q<lengthOfElement; q++) {
			int index = random.nextInt(alphabet.length());
			char randomChar = alphabet.charAt(index);
			sb.append(randomChar);			
		}	
			return sb.toString();
	}
	
	/*
	 * метод для определения прямой диагонали и определения ее элементов в массив,
	 * а также для сравнения элемента сформированого массива с предыдущим элементом 
	 * этого же массива 
	 */
	private static String[] directDiagonal() { 
	String[] array = new String[10];
	for(int i =  0; i<matrix.length; i++ ) {
		for (int j = 0; j<matrix[i].length; j++) {
			if(i==j) {
				array[i] = matrix[i][j];
				if(i>0) {
					System.out.println(array[i] + " equals to " + array[i-1] + " - " + array[i].equals(array[i-1]));
				}
			}
		}
	}	
	return array;
	}
	
	/*
	 * метод для определения побочной диагонали и определения ее элементов в массив,
	 * а также для сравнения элемента сформированого массива с предыдущим элементом 
	 * этого же массива 
	 */
	private static String[] sideDiagonal() {
		String[] array1 = new String[10];
		for(int i =  0; i<matrix.length; i++ ) {
			for (int j = 0; j<matrix[i].length; j++) {
				if(i == 0 && j == 9) {
					array1[i] = matrix[i][j];
					i++;  j--;
					
					while(i<=9 && j>=0) {
						array1[i] = matrix[i][j];
						System.out.println(array1[i] + " equals to " + array1[i-1] + " - " + array1[i].equals(array1[i-1]));
						i++;  j--;
					}
					break;
				}		
			}
		}
		return array1;
		
	}
	//метод для сравнения элементов двух массивов между собой
	public static void compareArrays(String[] arr, String[] arr1) {
		boolean result = false;
		for (int i = 0; i<arr.length; i++) {
			if (arr[i].equals(arr1[i])) {
				result = true;	
				System.out.println(result);
			} else {
				result = false;
				System.out.println(result);
			}
		}	
	}
	
     public static void isNumerical (String[] arr, String[] arr1)  { 
     
    	 List<Integer> ListOfNums = new ArrayList<>();
     
     	for(int i = 0; i<arr.length; i++) {
     	  	try{
     			double d = Double.parseDouble(arr[i]);
     			if(d>=1.7){
     				int more = (int) Math.ceil(d); 
     				ListOfNums.add(more);        				     				
     			}else{
     				int less = (int) Math.floor(d);
     				ListOfNums.add(less);
     			}	
      		}
     		catch(NumberFormatException nfe){
     			String str = String.valueOf(arr[i]);
     			str = str.substring(1,4);
     			sb1.append(str + ",");          			
       		} 
     	  	    			
   		 }
     	for(int i = 0; i<arr1.length; i++) {
     	  	try{
     			double d = Double.parseDouble(arr[i]);
     			if(d>=1.7){
     				int more = (int) Math.ceil(d); 
     				ListOfNums.add(more);        				     				
     			}else{
     				int less = (int) Math.floor(d);
     				ListOfNums.add(less);
     			}	
     			i++;     			
      		}
     		catch(NumberFormatException nfe){
     			String str = String.valueOf(arr[i]);
     			str = str.substring(2,4);
     			sb1.append(str);
       		} 
   		 }	 
   
   		ListOfNums.forEach((ListOfNum)-> System.out.print(ListOfNum + "_"));
   		System.out.println("");
   		System.out.println(sb1);
		}
	}
