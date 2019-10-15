package Assignment;
import java.util.ArrayList;
import java.util.*;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  ArrayList<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("BMW");
		  list_Strings.add("Aston Martin");
		  list_Strings.add("Mercedez");
		  list_Strings.add("Ferrari");
		  list_Strings.add("Chevrolet");
		  System.out.println("Before sort: "+list_Strings);
		  Collections.sort(list_Strings);
		  System.out.println("After sort: "+list_Strings);    


	}

}
