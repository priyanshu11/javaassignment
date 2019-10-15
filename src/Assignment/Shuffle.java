package Assignment;
import java.util.ArrayList;
import java.util.*;

public class Shuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  ArrayList<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("BMW");
		  list_Strings.add("Aston Martin");
		  list_Strings.add("Mercedez");
		  list_Strings.add("Ferrari");
		  list_Strings.add("Chevrolet");
		  System.out.println("Before shuffle: "+list_Strings);
		  Collections.shuffle(list_Strings);
		  System.out.println("After shuffle: "+list_Strings);    


	}

}
