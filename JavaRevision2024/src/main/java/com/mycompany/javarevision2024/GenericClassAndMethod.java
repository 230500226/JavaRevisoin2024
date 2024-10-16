/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javarevision2024;

/**
 *
 * @author ldxt460s
 */
public class GenericClassAndMethod {
    // Generic method to search for an element in an array
    public static <T> int searchElement(T[] array, T element) { //used ArrayLlist instead to use the collections framework
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(element)) {
                return i; // Return the index of the element
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        // Test the method on an integer array
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int intIndex = searchElement(intArray, 5);
        System.out.println("Integer array: Element 5 found at index: " + intIndex);

        // Test the method on a double array
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        int doubleIndex = searchElement(doubleArray, 4.4);
        System.out.println("Double array: Element 4.4 found at index: " + doubleIndex);
    }
}
