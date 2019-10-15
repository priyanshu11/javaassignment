package Assignment;
import java.util.ArrayList;

public class Retrieve {

	public static void main(String[] args) {
		
		
		
		
		 
		  
		  ArrayList<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("BMW");
		  list_Strings.add("Porche");
		  list_Strings.add("Mercedez");
		  list_Strings.add("Aston martin");
		  list_Strings.add("Ferrari");
		  
		  System.out.println(list_Strings);
		  
		  String element = list_Strings.get(0);
		  System.out.println("First element: "+element);
		  element = list_Strings.get(2);
		  System.out.println("Third element: "+element);
		 }
		


	}


