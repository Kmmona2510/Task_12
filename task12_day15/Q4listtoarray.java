package task12_day15;
/*
 *list to Array 
 * 
 */
import java.util.ArrayList;
import java.util.List;

public class Q4listtoarray {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();  //Create a list
		list.add(101);
		list.add(103);							//add value in list
		list.add(104);
		list.add(105);
		System.out.println("ArrayList is:" +list);   //print the list data
		
		Integer[] array =new Integer[list.size()];   //to convert list to array create a array and mention its size
		
		array =list.toArray(array);   				//using toArray method to convert list to array  
		
		System.out.println("Array is:");
		
		for(int i=0;i<array.length;i++) {  			//iterate the array
			System.out.println(array[i]);   			//print the array
		}

	}

}
