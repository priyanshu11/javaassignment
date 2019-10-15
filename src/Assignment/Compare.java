package Assignment;
import java.util.ArrayList;
import java.util.*;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  ArrayList<String> list_Strings = new ArrayList<String>();
		  ArrayList<String> list_Strings2 = new ArrayList<String>();
		  ArrayList<String> list_Strings3 = new ArrayList<String>();
		  list_Strings.add("BMW");
		  list_Strings.add("Aston Martin");
		  list_Strings.add("Mercedez");
		  list_Strings.add("Ferrari");
		  list_Strings.add("Chevrolet");
		  
		  
		  list_Strings2.add("BMW");
		  list_Strings2.add("Aston Martin");
		  list_Strings2.add("Maruti");
		  list_Strings2.add("Fiat");
		  list_Strings2.add("Carrera");
		    
 
          for (String e : list_Strings)
        	  list_Strings3.add(list_Strings2.contains(e) ? "EXIST" : "NOT EXIST");
          System.out.println(list_Strings3);
         

    	  }
      }

	
