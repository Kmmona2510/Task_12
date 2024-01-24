package task12_day15;

import java.util.ArrayList;
import java.util.List;

public class Q2ArrayList {

	public static void main(String[] args) {
		
		List <String> array = new ArrayList<>();  //create a Arraylist As String
		array.add("chennai");
		array.add("Delhi");          //add the value in list
		array.add("Mumbai");
		array.add("Kolkata");
		
		System.out.println("Before remove ArrayList");     //before remove the list
		
		System.out.println(array);  
		
		boolean removelist=array.removeAll(array);     //remove all the elements in array list using removeall method
		
		System.out.println("After remove ArrayList:");  
		
		System.out.println(removelist);  //after removing it return the boolean value 
		
		System.out.println(array);  //after removing element the list 

	}

}
