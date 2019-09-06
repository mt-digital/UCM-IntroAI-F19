/**
 * Example of how to use the HashSet class found in the java.util package.
 * (https://docs.oracle.com/javase/8/docs/api/java/util/package-summary.html)
 *
 * Author: Matthew A. Turner <mturner8@ucmerced.edu>
 * Date: 9/2/2019
 */

import java.util.HashSet;
import java.util.ArrayList;

class HashSetExample {
    public static void main (String[] args) {
        	
    	// How to define primitive data type variables:
    	int x = 1;
    	int y = 2;
    	int z = x * y;
    	System.out.printf("z = %d\n\n", z);
    	
    	double pi = 3.14159;
    	double twicePi = 2 * pi;
    	System.out.printf("2π = %.5f\n\n", twicePi);
    	
    	String s = "hello, world!";
    	System.out.println(s);
    	
    	// Define an ArrayList to put city names into.
    	ArrayList<String> citiesList = new ArrayList<String>();
        
        // Put some California city names in the list.
        citiesList.add("Merced");
        citiesList.add("Fresno");
        citiesList.add("San Luis Obispo");
        citiesList.add("San Francisco");
        citiesList.add("Los Angeles");
        	
        // Print the list to terminal output.
    	System.out.println("\nThe cities list, in same order as they were added:");
    	System.out.println(citiesList);
    	System.out.println();
        
        // 	Create a new, empty HashSet. HashSet is a Java "generic" container 
        // and we should provide the type of the elements we will put in the container.
        HashSet<String> citiesSet = new HashSet<String>();
        
        // Use Java for (each) notation to iterate over cities in list.
        for (String city : citiesList) {
        		citiesSet.add(city);
        }
        	// alternative method:
        HashSet<String> citiesSet2 = new HashSet<String>();
        for (int i=0; i < citiesList.size(); i++) { 
    		String thisCity = citiesList.get(i);
    		citiesSet2.add(thisCity);
        }
        
        // Check if a two city is in the set and add it if it is not.
        boolean fresnoInSet = citiesSet.add("Fresno");
        
        // We know Fresno is already in the set so we expect "Fresno already in citiesSet!" 
        // to be printed out.
        if (fresnoInSet) {
            System.out.println("Added Fresno!");
        }
        else {
            System.out.println("Fresno already in citiesSet!");
        }
        
        // This time we expect the conditional to evaluate to True, and "Added Santa Cruz!"
        // to be printed out.
        if (citiesSet.add("Santa Cruz")) {
            System.out.println("Added Santa Cruz!");
        }
        else {
            System.out.println("Santa Cruz already in citiesSet!");
        }
        
        // Another conditional statement but this time using HashSet.contains member function.
        if (citiesSet.contains("San Luis Obispo") && citiesSet.contains("San Francisco")) {
            System.out.println("Two saintly California city names present in set");
        }
        
        	System.out.println(citiesSet);
        	
        	
        	
//        	System.out.println(citiesSet2);
    }
}
