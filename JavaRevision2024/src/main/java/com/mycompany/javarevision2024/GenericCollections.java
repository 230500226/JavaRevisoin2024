/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javarevision2024;

/**
 *
 * @author ldxt460s
 */
import java.util.*;

public class GenericCollections {
    public static void start(String[] args) {
        // Generate a 10-element random integer array
        Random random = new Random();
        Integer[] randomArray = new Integer[10];
        for (int i = 0; i < 10; i++) {
            randomArray[i] = random.nextInt(100); // random integers between 0 and 99
        }

        // Represent the array as a list
        List<Integer> list = new ArrayList<>(Arrays.asList(randomArray));

        // Sort the list
        Collections.sort(list);

        // Search the list for an element specified by a user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to search for: ");
        int searchElement = scanner.nextInt();
        int index = Collections.binarySearch(list, searchElement);
        if (index >= 0) {
            System.out.println("Element " + searchElement + " found at index " + index);
        } else {
            System.out.println("Element " + searchElement + " not found in the list.");
        }

        // Remove duplicates from the list
        Set<Integer> set = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(set);

        // Determine the minimum and maximum values of the list elements
        int min = Collections.min(list);
        int max = Collections.max(list);
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);

        // Determine the number of occurrences of each unique element, present the results in tabular format
        Map<Integer, Integer> occurrences = new HashMap<>();
        for (Integer element : list) { // for (int =0; i < list.size(); i++)
            occurrences.put(element, occurrences.getOrDefault(element, 0) + 1);//  it puts the element in the map and the number of occurrences of the element. If the element is already in the map, it increments the number of occurrences by 1. If the element is not in the map, it adds the element to the map with 1 occurrence. 
            // and the occurrences.getOrDefault is a method that returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key.
            //map.containsKey(list.get(i)) then map.put(list.get(i), map.get(list.get(i)) + 1) else not yet in the put so map.put(list.get(i), 1)
        }

        System.out.println("Element\tOccurrences");
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
    }
}
