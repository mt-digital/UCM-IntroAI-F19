/**
 * Example of how to use the HashSet class found in the java.util package.
 * (https://docs.oracle.com/javase/8/docs/api/java/util/package-summary.html)
 *
 * Author: Matthew A. Turner <mturner8@ucmerced.edu>
 * Date: 9/2/2019
 */

import java.util.HashSet;

class HashSetExample {
    public static void main (String[] args) {
        // Create a new, empty HashSet. HashSet is a Java "generic" container 
        // and we should provide the type of the elements we will put in the container.
        HashSet<String> citiesSet = new HashSet<String>();
        
        // Put some California city names in the set.
        citiesSet.add("Merced");
        citiesSet.add("Fresno");
        citiesSet.add("San Luis Obispo");
        citiesSet.add("San Francisco");
        citiesSet.add("Los Angeles");

        // Check if a two city is in the set and add it if it is not.
        boolean fresnoInSet = citiesSet.add("Fresno");
        if (fresnoInSet) {
            System.out.println("Added Fresno!");
        }
        else {
            System.out.println("Fresno already there!");
        }

        if (citiesSet.add("Santa Cruz")) {
            System.out.println("Added Santa Cruz!");
        }
        else {
            System.out.println("Santa Cruz already there!");
        }

        if (citiesSet.contains("San Luis Obispo") && citiesSet.contains("San Francisco")) {
            System.out.println("Two saintly California city names present in set");
        }
    }
}
