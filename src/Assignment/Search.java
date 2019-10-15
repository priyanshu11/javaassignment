package Assignment;
import 	java.util.ArrayList;

public class Search {


    
		
		
		  public static void main(String[] args) {
		  
		  ArrayList<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("BMW");
		  list_Strings.add("Mercedez");
		  list_Strings.add("Aston Martin");
		  list_Strings.add("Ferrari");
		  list_Strings.add("Bentley");
		  
		    if (list_Strings.contains("BMW")) {
		    System.out.println("Found");
		    } else {
		    System.out.println("Not found");
		    }
		 }
		

}
